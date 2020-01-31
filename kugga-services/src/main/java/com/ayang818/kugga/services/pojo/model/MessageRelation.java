package com.ayang818.kugga.services.pojo.model;

import java.util.Date;

public class MessageRelation extends MessageRelationKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_relation.other_uid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Long otherUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_relation.is_sender
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Boolean isSender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kugga_message_relation.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_relation.other_uid
     *
     * @return the value of kugga_message_relation.other_uid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Long getOtherUid() {
        return otherUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_relation.other_uid
     *
     * @param otherUid the value for kugga_message_relation.other_uid
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setOtherUid(Long otherUid) {
        this.otherUid = otherUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_relation.is_sender
     *
     * @return the value of kugga_message_relation.is_sender
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Boolean getIsSender() {
        return isSender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_relation.is_sender
     *
     * @param isSender the value for kugga_message_relation.is_sender
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setIsSender(Boolean isSender) {
        this.isSender = isSender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kugga_message_relation.create_time
     *
     * @return the value of kugga_message_relation.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kugga_message_relation.create_time
     *
     * @param createTime the value for kugga_message_relation.create_time
     *
     * @mbg.generated Fri Jan 31 14:35:32 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}