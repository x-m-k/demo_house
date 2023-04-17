package com.example.mapper;

import com.example.model.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsAdminMapper {
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
    int insert(UmsAdmin record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsAdmin record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsAdmin record);
}