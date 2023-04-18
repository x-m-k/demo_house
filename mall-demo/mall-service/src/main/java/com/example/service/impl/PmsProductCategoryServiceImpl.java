package com.example.service.impl;


import com.example.mapper.PmsProductCategoryMapper;
import com.example.model.PmsProduct;
import com.example.model.PmsProductCategory;
import com.example.service.PmsProductCategoryService;
import com.example.service.PmsProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pmsProductCategoryService")
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductCategory record) {
        return pmsProductCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.insertSelective(record);
    }

    @Override
    public PmsProductCategory selectByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKey(record);
    }


    //根据实体类pmsProductCategory的任意属性查询数据
    public PageInfo<PmsProductCategory> findByCondition(PmsProductCategory pmsProductCategory, Integer PageNum, Integer PageSize) throws JsonProcessingException {

        PageInfo<PmsProductCategory> pageInfo = null;

        PageHelper.startPage(PageNum, PageSize);

        List<PmsProductCategory> pmsProductCategories = null;

        ObjectMapper objectMapper = new ObjectMapper();


//        Object value = redisTemplate.opsForValue().get("category_list");

//        if (value != null&&pmsProductCategory==null) {
//
//            pmsProductCategories = objectMapper.readValue(value.toString(), new TypeReference<List<PmsProductCategory>>() {
//            });
//        } else {
//            pmsProductCategories = pmsProductCategoryMapper.findByCondition(pmsProductCategory);
//
//            if (pmsProductCategory == null) {
//                redisTemplate.opsForValue().set("category_list", objectMapper.writeValueAsString(pmsProductCategories));
//            }
//        }
        pmsProductCategories = pmsProductCategoryMapper.findByCondition(pmsProductCategory);

        pageInfo = new PageInfo<>(pmsProductCategories);

        return pageInfo;
    }
}
