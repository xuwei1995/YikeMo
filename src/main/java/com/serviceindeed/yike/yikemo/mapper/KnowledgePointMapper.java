package com.serviceindeed.yike.yikemo.mapper;

import com.serviceindeed.yike.yikemo.domain.KnowledgePoint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface KnowledgePointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long knowledgePointId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    int insert(KnowledgePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    int insertSelective(KnowledgePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    KnowledgePoint selectByPrimaryKey(Long knowledgePointId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(KnowledgePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_point
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(KnowledgePoint record);

    List<KnowledgePoint> getAllKnowledgePoints(KnowledgePoint knowledgePoint);
}