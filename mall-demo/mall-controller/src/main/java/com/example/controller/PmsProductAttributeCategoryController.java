package com.example.controller;


import com.example.model.PmsProductAttributeCategory;
import com.example.service.PmsProductAttributeCategoryService;
import com.example.util.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pmsProductAttributeCategory")
public class PmsProductAttributeCategoryController {

    @Autowired
    private PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    /**
     * 根据 实体类任意条件查询
     */
    @GetMapping("/findByCondition")
    public Result<PageInfo> findByCondition(PmsProductAttributeCategory pmsProductAttributeCategory, Integer PageNum, Integer PageSize) {
        PageInfo<PmsProductAttributeCategory> pageInfo = pmsProductAttributeCategoryService.findByCondition(pmsProductAttributeCategory, PageNum, PageSize);
        if (pageInfo != null) {
            return Result.success(pageInfo);
        } else {
            return Result.failed();
        }
    }


    @PostMapping("/delete")
    public Result delete(List<Long> ids) {
        int i = pmsProductAttributeCategoryService.delete_batch(ids);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/insert")
    public Result insert(PmsProductAttributeCategory pmsProductAttributeCategory) {
        int i = pmsProductAttributeCategoryService.insert(pmsProductAttributeCategory);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/update")
    public Result update(PmsProductAttributeCategory pmsProductAttributeCategory) {
        int i = pmsProductAttributeCategoryService.updateByPrimaryKeySelective(pmsProductAttributeCategory);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }
}
