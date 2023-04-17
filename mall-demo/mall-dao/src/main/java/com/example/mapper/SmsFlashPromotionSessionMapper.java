package com.example.mapper;

import com.example.model.SmsFlashPromotionSession;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsFlashPromotionSessionMapper {
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
    int insert(SmsFlashPromotionSession record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsFlashPromotionSession record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsFlashPromotionSession record);
}