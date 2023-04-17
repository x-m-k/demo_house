package com.example.mapper;

import com.example.model.CmsSubjectCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsSubjectCategoryMapper {
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
    int insert(CmsSubjectCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsSubjectCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsSubjectCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsSubjectCategory record);
}