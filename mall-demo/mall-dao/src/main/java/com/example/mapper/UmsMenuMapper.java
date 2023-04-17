package com.example.mapper;

import com.example.model.UmsMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMenuMapper {
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
    int insert(UmsMenu record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMenu record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMenu selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMenu record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMenu record);
}