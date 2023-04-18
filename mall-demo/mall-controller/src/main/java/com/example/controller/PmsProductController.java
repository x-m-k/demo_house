package com.example.controller;


import com.example.model.PmsProduct;
import com.example.service.PmsProductService;
import com.example.util.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.List;

@RestController
@RequestMapping("/pmsProduct")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    @GetMapping("/findByCondition")
    public Result<PageInfo> findByCondition(PmsProduct pmsProduct, Integer PageSize, Integer PageNum) throws JsonProcessingException {
        PageInfo<PmsProduct> pageInfo = pmsProductService.findByCondition(pmsProduct, PageNum, PageSize);
        if (pageInfo != null && pageInfo.getSize() > 0) {
            return Result.success(pageInfo);
        } else {
            return Result.failed();
        }
    }

    @GetMapping("/findAll")
    public Result<PageInfo> findAll(Integer PageSeiz, Integer PageNum) throws JsonProcessingException {
        PageInfo<PmsProduct> pageInfo = pmsProductService.findByCondition(null, null,null);
        if (pageInfo != null && pageInfo.getSize() > 0) {
            return Result.success(pageInfo);
        } else {
            return Result.failed();
        }
    }

    //修改delete_status状态
    @PostMapping("/update")
    public Result update(PmsProduct pmsProduct, List<Long> ids) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String vertifyMan = (String) request.getSession().getAttribute(("admin"));
        int i = pmsProductService.updateByPrimaryKeySelective(pmsProduct, ids, vertifyMan);
        if (i >=1) {
            return Result.success();
        } else {
            return Result.failed();
        }
    }


    @PostMapping("/insert")
    public Result insert(PmsProduct pmsProduct){
        int i=pmsProductService.insert(pmsProduct);
        if (i>=1){
            return Result.success();
        }else {
            return  Result.failed();
        }
    }
}
