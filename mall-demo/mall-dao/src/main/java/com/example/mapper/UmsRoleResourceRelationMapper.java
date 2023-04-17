package com.example.mapper;

import com.example.model.UmsRoleResourceRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsRoleResourceRelationMapper {
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
    int insert(UmsRoleResourceRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsRoleResourceRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsRoleResourceRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsRoleResourceRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsRoleResourceRelation record);
}