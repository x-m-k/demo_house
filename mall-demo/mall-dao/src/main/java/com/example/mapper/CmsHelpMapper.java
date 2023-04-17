package com.example.mapper;

import com.example.model.CmsHelp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsHelpMapper {
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
    int insert(CmsHelp record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsHelp record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CmsHelp selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CmsHelp record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CmsHelp record);
}