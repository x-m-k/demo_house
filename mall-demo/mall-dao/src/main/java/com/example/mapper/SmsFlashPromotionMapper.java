package com.example.mapper;

import com.example.model.SmsFlashPromotion;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsFlashPromotionMapper {
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
    int insert(SmsFlashPromotion record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsFlashPromotion record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsFlashPromotion selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsFlashPromotion record);
}