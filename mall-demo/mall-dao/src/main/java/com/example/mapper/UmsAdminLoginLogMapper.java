package com.example.mapper;

import com.example.model.UmsAdminLoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsAdminLoginLogMapper {
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
    int insert(UmsAdminLoginLog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsAdminLoginLog record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsAdminLoginLog selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsAdminLoginLog record);
}