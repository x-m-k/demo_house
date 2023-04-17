package com.example.mapper;

import com.example.model.CmsTopicCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsTopicCategoryMapper {
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
    int insert(CmsTopicCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsTopicCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsTopicCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsTopicCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsTopicCategory record);
}