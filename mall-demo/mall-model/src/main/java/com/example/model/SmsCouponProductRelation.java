package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 优惠券和产品的关系表
    */
@ApiModel(description="优惠券和产品的关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCouponProductRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long couponId;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品编码
    */
    @ApiModelProperty(value="商品编码")
    private String productSn;

    private static final long serialVersionUID = 1L;
}