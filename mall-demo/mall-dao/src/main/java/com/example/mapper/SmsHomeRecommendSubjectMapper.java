package com.example.mapper;

import com.example.model.SmsHomeRecommendSubject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsHomeRecommendSubjectMapper {
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
    int insert(SmsHomeRecommendSubject record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsHomeRecommendSubject record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsHomeRecommendSubject record);
}