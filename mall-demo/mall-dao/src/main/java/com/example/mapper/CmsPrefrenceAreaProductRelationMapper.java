package com.example.mapper;

import com.example.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsPrefrenceAreaProductRelationMapper {
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
    int insert(CmsPrefrenceAreaProductRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsPrefrenceAreaProductRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}