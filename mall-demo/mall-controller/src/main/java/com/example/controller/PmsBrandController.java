package com.example.controller;


import com.example.model.PmsBrand;
import com.example.model.PmsBrand;
import com.example.service.PmsBrandService;
import com.example.util.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("/findByCondition")
    public Result<PageInfo> findByCondition(PmsBrand pmsBrand, Integer PageNum, Integer PageSize) throws JsonProcessingException {
        PageInfo<PmsBrand> pageInfo = pmsBrandService.findByCondition(pmsBrand, PageNum, PageSize);
        if (pageInfo != null) {
            return Result.success(pageInfo);
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/delete")
    public Result delete(Long id) {
        int i = pmsBrandService.deleteByPrimaryKey(id);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/insert")
    public Result insert(PmsBrand pmsBrand) {
        int i = pmsBrandService.insert(pmsBrand);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/update")
    public Result update(PmsBrand pmsBrand) {
        int i = pmsBrandService.updateByPrimaryKeySelective(pmsBrand);
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

    @PostMapping("/update_batch")
    public Result update_batch(PmsBrand pmsBrand, List<Long> ids) {
        int i = 0;
        if (pmsBrand.getFactoryStatus() != null) {
            i = pmsBrandService.updateFactoryStatus_bacth(pmsBrand.getFactoryStatus(), ids);
        }
        if (pmsBrand.getShowStatus() != null) {
            i = pmsBrandService.updateShowStatus_bacth(pmsBrand.getShowStatus(), ids);
        }
        if (i >= 1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }

}
