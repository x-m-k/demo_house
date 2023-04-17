package com.example.mapper;

import com.example.model.CmsTopic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsTopicMapper {
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
    int insert(CmsTopic record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsTopic record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsTopic selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsTopic record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsTopic record);
}