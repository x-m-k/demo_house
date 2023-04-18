package com.example.service.impl;

import com.example.mapper.PmsProductMapper;
import com.example.mapper.PmsProductVertifyRecordMapper;
import com.example.model.PmsProduct;
import com.example.model.PmsProductVertifyRecord;
import com.example.service.PmsProductService;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("pmsProductService")
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductMapper pmsProductMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    //商品信息审核
    @Autowired
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

    @Override
    public PageInfo<PmsProduct> findByCondition(PmsProduct pmsProduct, Integer PageNum, Integer PageSize) throws JsonProcessingException {

        PageInfo<PmsProduct> pageInfo = null;

        PageHelper.startPage(PageNum, PageSize);

        List<PmsProduct> pmsProducts = null;

        ObjectMapper objectMapper = new ObjectMapper();

//        Object value = redisTemplate.opsForValue().get("product_list");
//
//        if (value != null) {
//            pmsProducts = objectMapper.readValue(value.toString(), new TypeReference<List<PmsProduct>>() {
//            });
//
//        } else {
//
//            pmsProducts = pmsProductMapper.list(pmsProduct);
//            redisTemplate.opsForValue().set("product_list", objectMapper.writeValueAsString(pmsProducts));
//
//        }
        pmsProducts = pmsProductMapper.list(pmsProduct);

        pageInfo = new PageInfo<>(pmsProducts);

        return pageInfo;

    }


    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProduct record) {
        return pmsProductMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProduct record) {
        return pmsProductMapper.insertSelective(record);
    }

    @Override
    public PmsProduct selectByPrimaryKey(Long id) {
        return pmsProductMapper.selectByPrimaryKey(id);
    }

    //修改商品信息 和  商品验证
    @Override
    public int updateByPrimaryKeySelective(PmsProduct pmsProduct, List<Long> ids, String vertifyMan) {
        //1.审核验证属性不为空时发生,  批量插入审核信息
        if (pmsProduct.getVerifyStatus() != null) {
            //添加审核记录
            List<PmsProductVertifyRecord> list = new ArrayList<>();
            for (Long id : ids) {
                PmsProductVertifyRecord pmsProductVertifyRecord = new PmsProductVertifyRecord();
                pmsProductVertifyRecord.setProductId(id);
                //VertifyMan审核人后台从session中获取
                pmsProductVertifyRecord.setVertifyMan(vertifyMan);
                pmsProductVertifyRecord.setStatus(pmsProduct.getVerifyStatus());
                pmsProductVertifyRecord.setCreateTime(new Date());
                String detail = null;
                if (pmsProduct.getVerifyStatus() == 1) {
                    detail = "验证通过";
                } else {
                    detail = "验证失败";
                }
                pmsProductVertifyRecord.setDetail(detail);
                list.add(pmsProductVertifyRecord);
                pmsProductVertifyRecordMapper.insert_batch(list);
            }

        }
        //2.修改商品信息
        pmsProductMapper.update_batch(pmsProduct, ids);

        return pmsProductMapper.updateByPrimaryKeySelective(pmsProduct);
    }

    @Override
    public int updateByPrimaryKey(PmsProduct record) {
        return pmsProductMapper.updateByPrimaryKey(record);
    }

}
