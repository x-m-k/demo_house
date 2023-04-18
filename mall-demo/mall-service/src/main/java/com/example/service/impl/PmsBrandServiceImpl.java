package com.example.service.impl;

import com.example.mapper.PmsBrandMapper;
import com.example.model.PmsBrand;
import com.example.model.PmsProductCategory;
import com.example.service.PmsBrandService;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("pmsBrand")
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Autowired
    private RedisTemplate redisTemplate=new RedisTemplate();

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBrand record) {
        return pmsBrandMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBrand record) {
        return pmsBrandMapper.insertSelective(record);
    }

    @Override
    public PmsBrand selectByPrimaryKey(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateShowStatus_bacth(Integer showStatus, List<Long> ids) {
        return pmsBrandMapper.updateShowStatus_bacth(showStatus,ids);
    }

    @Override
    public int updateFactoryStatus_bacth(Integer factoryStatus, List<Long> ids) {
        return pmsBrandMapper.updateFactoryStatus_bacth(factoryStatus,ids);
    }



    @Override
    public PageInfo<PmsBrand> findByCondition(PmsBrand pmsBrand,Integer PageNum,Integer PageSize)throws JsonProcessingException {
        PageInfo<PmsBrand>pageInfo=null;
        List<PmsBrand>pmsBrands=new ArrayList<>();
        PageHelper.offsetPage(PageNum,PageSize);
        ObjectMapper objectMapper=new ObjectMapper();
//        Object value=redisTemplate.opsForValue().get("pmsBrand_list");
//        if (value!=null&&pmsBrand==null){
//            pmsBrands=objectMapper.readValue(value.toString(), new TypeReference<List<PmsBrand>>() {
//            });
//        }else {
//            pmsBrands=pmsBrandMapper.findByCondition(pmsBrand);
//            if (pmsBrand==null){
//                redisTemplate.opsForValue().set("pmsBrand_list", objectMapper.writeValueAsString(pmsBrands));
//            }
//        }

        pmsBrands=pmsBrandMapper.findByCondition(pmsBrand);

        pageInfo= new PageInfo<>(pmsBrands);

        return pageInfo;
    }
}
