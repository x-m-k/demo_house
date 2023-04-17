package com.example.mapper;

import com.example.model.SmsFlashPromotionLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsFlashPromotionLogMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SmsFlashPromotionLog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsFlashPromotionLog record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsFlashPromotionLog record);
}