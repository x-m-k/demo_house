package com.example.mapper;

import com.example.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsPermissionMapper {
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
    int insert(UmsPermission record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsPermission record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsPermission record);
}