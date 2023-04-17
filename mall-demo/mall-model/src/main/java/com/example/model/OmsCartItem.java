package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 购物车表
    */
@ApiModel(description="购物车表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsCartItem implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Long productSkuId;

    @ApiModelProperty(value="")
    private Long memberId;

    /**
    * 购买数量
    */
    @ApiModelProperty(value="购买数量")
    private Integer quantity;

    /**
    * 添加到购物车的价格
    */
    @ApiModelProperty(value="添加到购物车的价格")
    private BigDecimal price;

    /**
    * 商品主图
    */
    @ApiModelProperty(value="商品主图")
    private String productPic;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品副标题（卖点）
    */
    @ApiModelProperty(value="商品副标题（卖点）")
    private String productSubTitle;

    /**
    * 商品sku条码
    */
    @ApiModelProperty(value="商品sku条码")
    private String productSkuCode;

    /**
    * 会员昵称
    */
    @ApiModelProperty(value="会员昵称")
    private String memberNickname;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createDate;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date modifyDate;

    /**
    * 是否删除
    */
    @ApiModelProperty(value="是否删除")
    private Integer deleteStatus;

    /**
    * 商品分类
    */
    @ApiModelProperty(value="商品分类")
    private Long productCategoryId;

    @ApiModelProperty(value="")
    private String productBrand;

    @ApiModelProperty(value="")
    private String productSn;

    /**
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    */
    @ApiModelProperty(value="商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}