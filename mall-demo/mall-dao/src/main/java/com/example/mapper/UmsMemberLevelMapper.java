package com.example.mapper;

import com.example.model.UmsMemberLevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberLevelMapper {
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
    int insert(UmsMemberLevel record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberLevel record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberLevel selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberLevel record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberLevel record);
}