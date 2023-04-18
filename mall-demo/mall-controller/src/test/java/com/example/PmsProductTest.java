package com.example;


import com.example.model.PmsProduct;
import com.example.model.PmsProductCategory;
import com.example.service.PmsProductCategoryService;
import com.example.service.PmsProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class
PmsProductTest {
    @Autowired
    private PmsProductService pmsProductService;

    @Autowired
    private PmsProductCategoryService pmsProductCategoryService;

    //商品列表测试
    @Test
    public void list()throws JsonProcessingException {
        PmsProduct pmsProduct=new PmsProduct();
        pmsProduct.setId(1L);
        PageInfo<PmsProduct>pageInfo=pmsProductService.findByCondition(null,1,1);
    }

    //商品验证测试  和  商品信息修改
    @Test
    public void vertify(){
        PmsProduct pmsProduct=new PmsProduct();
        List<Long>ids=new ArrayList<>();
        ids.add(1L);
        ids.add(4L);
        pmsProduct.setVerifyStatus(1);
        pmsProductService.updateByPrimaryKeySelective(pmsProduct,ids,"小徐");
    }


    //测试产品分类列表
    @Test
    public void category()throws  JsonProcessingException{
        PmsProductCategory pmsProductCategory=new PmsProductCategory();
        PageInfo<PmsProductCategory>pageInfo=pmsProductCategoryService.findByCondition(null,null,null);
        System.out.println(pageInfo);
    }
}
