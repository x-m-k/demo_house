package com.example.mapper;

import com.example.model.CmsTopicComment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsTopicCommentMapper {
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
    int insert(CmsTopicComment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsTopicComment record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsTopicComment selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsTopicComment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsTopicComment record);
}