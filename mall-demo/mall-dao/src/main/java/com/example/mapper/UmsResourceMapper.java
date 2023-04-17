package com.example.mapper;

import com.example.model.UmsResource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsResourceMapper {
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
    int insert(UmsResource record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsResource record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsResource selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsResource record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsResource record);
}