package com.example.mapper;

import com.example.model.CmsHelpCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsHelpCategoryMapper {
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
    int insert(CmsHelpCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsHelpCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}