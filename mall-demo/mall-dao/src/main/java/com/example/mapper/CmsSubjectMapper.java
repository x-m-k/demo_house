package com.example.mapper;

import com.example.model.CmsSubject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsSubjectMapper {
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
    int insert(CmsSubject record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsSubject record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsSubject selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsSubject record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsSubject record);
}