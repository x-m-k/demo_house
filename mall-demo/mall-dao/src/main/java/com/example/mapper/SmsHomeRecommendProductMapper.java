package com.example.mapper;

import com.example.model.SmsHomeRecommendProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsHomeRecommendProductMapper {
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
    int insert(SmsHomeRecommendProduct record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsHomeRecommendProduct record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}