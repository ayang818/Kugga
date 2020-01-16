package com.ayang818.kugga.starter.mapper;

import com.ayang818.kugga.starter.pojo.model.Relation;
import com.ayang818.kugga.starter.pojo.model.RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    long countByExample(RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int deleteByExample(RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int insert(Relation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int insertSelective(Relation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    List<Relation> selectByExampleWithRowbounds(RelationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    List<Relation> selectByExample(RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    Relation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int updateByPrimaryKeySelective(Relation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_info
     *
     * @mbg.generated Wed Jan 15 15:25:26 CST 2020
     */
    int updateByPrimaryKey(Relation record);
}