package com.example.mapper;

import com.example.model.UmsRoleMenuRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsRoleMenuRelationMapper {
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
    int insert(UmsRoleMenuRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsRoleMenuRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsRoleMenuRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsRoleMenuRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsRoleMenuRelation record);
}