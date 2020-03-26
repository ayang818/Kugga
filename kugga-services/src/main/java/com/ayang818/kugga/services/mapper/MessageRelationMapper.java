package com.ayang818.kugga.services.mapper;

import com.ayang818.kugga.services.pojo.model.MessageRelation;
import com.ayang818.kugga.services.pojo.model.MessageRelationExample;
import com.ayang818.kugga.services.pojo.model.MessageRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MessageRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    long countByExample(MessageRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int deleteByExample(MessageRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int deleteByPrimaryKey(MessageRelationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int insert(MessageRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int insertSelective(MessageRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    List<MessageRelation> selectByExampleWithRowbounds(MessageRelationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    List<MessageRelation> selectByExample(MessageRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    MessageRelation selectByPrimaryKey(MessageRelationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") MessageRelation record, @Param("example") MessageRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int updateByExample(@Param("record") MessageRelation record, @Param("example") MessageRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int updateByPrimaryKeySelective(MessageRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kugga_message_relation
     *
     * @mbg.generated Thu Mar 26 14:54:36 CST 2020
     */
    int updateByPrimaryKey(MessageRelation record);
}