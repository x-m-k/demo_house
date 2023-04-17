package com.example.mapper;

import com.example.model.UmsMemberTag;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberTagMapper {
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
    int insert(UmsMemberTag record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberTag record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberTag selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberTag record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberTag record);
}