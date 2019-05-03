package com.wade.groupme.callback.api;

public class GroupMeMessage {
    private String[] attachments;
    private String avatar_url;
    private String created_at;
    private String group_id;
    private String id;
    private String name;
    private String sender_id;
    private String sender_type;
    private String source_guid;
    private String system;
    private String text;
    private String user_id;

    public GroupMeMessage(String sender_id, String text) {
        super();
        this.sender_id = sender_id;
        this.text = text;
    }

    /**
     * @return the attachments
     */
    public String[] getAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(String[] attachments) {
        this.attachments = attachments;
    }

    /**
     * @return the avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * @param avatar_url the avatar_url to set
     */
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the group_id
     */
    public String getGroup_id() {
        return group_id;
    }

    /**
     * @param group_id the group_id to set
     */
    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sender_id
     */
    public String getSender_id() {
        return sender_id;
    }

    /**
     * @param sender_id the sender_id to set
     */
    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    /**
     * @return the sender_type
     */
    public String getSender_type() {
        return sender_type;
    }

    /**
     * @param sender_type the sender_type to set
     */
    public void setSender_type(String sender_type) {
        this.sender_type = sender_type;
    }

    /**
     * @return the source_guid
     */
    public String getSource_guid() {
        return source_guid;
    }

    /**
     * @param source_guid the source_guid to set
     */
    public void setSource_guid(String source_guid) {
        this.source_guid = source_guid;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @param system the system to set
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}