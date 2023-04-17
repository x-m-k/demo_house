package com.example.mapper;

import com.example.model.OmsCompanyAddress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OmsCompanyAddressMapper {
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
    int insert(OmsCompanyAddress record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OmsCompanyAddress record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    OmsCompanyAddress selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OmsCompanyAddress record);
}