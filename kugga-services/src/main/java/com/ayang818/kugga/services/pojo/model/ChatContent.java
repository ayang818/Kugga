package com.ayang818.kugga.services.pojo.model;

import java.util.Date;

public class ChatContent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_message_content.id
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_message_content.content
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_message_content.type
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_message_content.create_time
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_message_content.id
     *
     * @return the value of chat_message_content.id
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_message_content.id
     *
     * @param id the value for chat_message_content.id
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_message_content.content
     *
     * @return the value of chat_message_content.content
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_message_content.content
     *
     * @param content the value for chat_message_content.content
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_message_content.type
     *
     * @return the value of chat_message_content.type
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_message_content.type
     *
     * @param type the value for chat_message_content.type
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_message_content.create_time
     *
     * @return the value of chat_message_content.create_time
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_message_content.create_time
     *
     * @param createTime the value for chat_message_content.create_time
     *
     * @mbg.generated Sun Jan 19 22:08:53 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}