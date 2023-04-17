package com.example.mapper;

import com.example.model.UmsMemberLoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberLoginLogMapper {
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
    int insert(UmsMemberLoginLog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberLoginLog record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberLoginLog selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberLoginLog record);
}