package com.ayang818.kugga.services.pojo.model;

import java.util.Date;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.mid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Long mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.content
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.sender_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Long senderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.receiver_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Long receiverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.msg_type
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Integer msgType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_content.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.mid
     *
     * @return the value of kugga_message_content.mid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Long getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.mid
     *
     * @param mid the value for kugga_message_content.mid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setMid(Long mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.content
     *
     * @return the value of kugga_message_content.content
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.content
     *
     * @param content the value for kugga_message_content.content
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.sender_id
     *
     * @return the value of kugga_message_content.sender_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.sender_id
     *
     * @param senderId the value for kugga_message_content.sender_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.receiver_id
     *
     * @return the value of kugga_message_content.receiver_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.receiver_id
     *
     * @param receiverId the value for kugga_message_content.receiver_id
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.msg_type
     *
     * @return the value of kugga_message_content.msg_type
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.msg_type
     *
     * @param msgType the value for kugga_message_content.msg_type
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_content.create_time
     *
     * @return the value of kugga_message_content.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_content.create_time
     *
     * @param createTime the value for kugga_message_content.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}