package com.wade.groupme.callback.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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

    @GetMapping
    public GroupMeMessage get() {
        LOGGER.error("Received GET request");
        return new GroupMeMessage("sender_id", "text");
    }

    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void receive(@RequestBody GroupMeMessage message) {
        LOGGER.error("Received post request: " + message.getGroup_id());
    }

    
}