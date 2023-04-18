package com.example.mapper;

import com.example.model.PmsProduct;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PmsProductMapper {
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
    int insert(PmsProduct record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProduct record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProduct selectByPrimaryKey(Long id);

    List<PmsProduct>list(PmsProduct pmsProduct);


    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProduct record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProduct record);


    //批量修改商品信息
    int update_batch(@Param("record")PmsProduct record,@Param("ids")List ids);
}