package com.example.service.impl;


import com.example.mapper.PmsProductAttributeCategoryMapper;
import com.example.model.PmsProductAttributeCategory;
import com.example.service.PmsProductAttributeCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pmsProductAttributeCategoryService")
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {

    @Autowired
    private PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delete_batch(List<Long> ids) {
        return pmsProductAttributeCategoryMapper.delete_batch(ids);
    }

    @Override
    public int insert(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insertSelective(record);
    }

    @Override
    public PmsProductAttributeCategory selectByPrimaryKey(Long id) {
        return pmsProductAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<PmsProductAttributeCategory> findByCondition(PmsProductAttributeCategory pmsProductAttributeCategory, Integer PageNum, Integer PageSize) {
        PageInfo<PmsProductAttributeCategory> pageInfo = null;
        PageHelper.offsetPage(PageNum, PageSize);
        List<PmsProductAttributeCategory> pmsProductAttributeCategories = pmsProductAttributeCategoryMapper.findByCondition(pmsProductAttributeCategory);
        pageInfo = new PageInfo<>(pmsProductAttributeCategories);
        return pageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.updateByPrimaryKey(record);
    }
}
