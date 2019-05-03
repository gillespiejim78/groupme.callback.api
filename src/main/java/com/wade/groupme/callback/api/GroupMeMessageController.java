package com.wade.groupme.callback.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class GroupMeMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GroupMeMessageController.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping
    public GroupMeMessage get() {
        LOGGER.error("Received GET request");
        return new GroupMeMessage("sender_id", "text");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void receive(@RequestBody GroupMeMessage message) throws JsonProcessingException {
        LOGGER.error("Received post request: " + message.getText());
        ObjectMapper objectMapper = new ObjectMapper();
        final String messageJson = objectMapper.writeValueAsString(message);
        LOGGER.error("GroupMeMessage to string: " + messageJson);
        template.send("test", messageJson);
    }
}