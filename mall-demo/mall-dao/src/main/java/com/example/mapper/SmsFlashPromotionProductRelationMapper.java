package com.example.mapper;

import com.example.model.SmsFlashPromotionProductRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsFlashPromotionProductRelationMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SmsFlashPromotionProductRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsFlashPromotionProductRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}