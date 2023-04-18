package com.example.controller;


import com.example.model.PmsProductCategory;
import com.example.model.PmsProductCategory;
import com.example.service.PmsProductCategoryService;
import com.example.util.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pmsProductCategory")
public class PmsProductCategoryController {
    @Autowired
    private PmsProductCategoryService pmsProductCategoryService;

    @GetMapping("/findByCondition")
    public Result<PageInfo> findByCondition(PmsProductCategory pmsProductCategory, Integer PageNum, Integer PageSize) throws JsonProcessingException {
        PageInfo<PmsProductCategory> pageInfo = pmsProductCategoryService.findByCondition(pmsProductCategory, PageNum, PageSize);
        if (pageInfo != null) {
            return Result.success(pageInfo);
        } else {
            return Result.failed(pageInfo);
        }
    }

    @PostMapping("/delete")
    public Result delete(Long id) {
        int i = pmsProductCategoryService.deleteByPrimaryKey(id);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/insert")
    public Result insert(PmsProductCategory pmsProductCategory) {
        int i = pmsProductCategoryService.insert(pmsProductCategory);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/update")
    public Result update(PmsProductCategory pmsProductCategory) {
        int i = pmsProductCategoryService.updateByPrimaryKeySelective(pmsProductCategory);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }
}
