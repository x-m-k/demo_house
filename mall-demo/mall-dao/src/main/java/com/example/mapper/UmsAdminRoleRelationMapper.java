package com.example.mapper;

import com.example.model.UmsAdminRoleRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsAdminRoleRelationMapper {
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
    int insert(UmsAdminRoleRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}