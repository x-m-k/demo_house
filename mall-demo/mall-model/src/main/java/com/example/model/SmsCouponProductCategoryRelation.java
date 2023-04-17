package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 优惠券和产品分类关系表
    */
@ApiModel(description="优惠券和产品分类关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCouponProductCategoryRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long couponId;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    /**
    * 产品分类名称
    */
    @ApiModelProperty(value="产品分类名称")
    private String productCategoryName;

    /**
    * 父分类名称
    */
    @ApiModelProperty(value="父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}