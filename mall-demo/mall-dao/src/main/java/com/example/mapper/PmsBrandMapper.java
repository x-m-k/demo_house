package com.example.mapper;

import com.example.model.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PmsBrandMapper {
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
    int insert(PmsBrand record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsBrand record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsBrand record);

    /**
     * 批量修改显示状态
     * @param showStatus
     * @param ids
     * @return
     */
    int updateShowStatus_bacth(Integer showStatus,@Param("ids") List<Long> ids);


    /**
     * 修改是否是 品牌商制造商
     * @param FactoryStatus
     * @param ids
     * @return
     */
    int updateFactoryStatus_bacth(Integer FactoryStatus,@Param("ids") List<Long> ids);


    List<PmsBrand>findByCondition(PmsBrand pmsBrand);
}