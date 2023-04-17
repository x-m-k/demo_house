package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 订单中所包含的商品
    */
@ApiModel(description="订单中所包含的商品")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderItem implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 订单id
    */
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
    * 订单编号
    */
    @ApiModelProperty(value="订单编号")
    private String orderSn;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private String productPic;

    @ApiModelProperty(value="")
    private String productName;

    @ApiModelProperty(value="")
    private String productBrand;

    @ApiModelProperty(value="")
    private String productSn;

    /**
    * 销售价格
    */
    @ApiModelProperty(value="销售价格")
    private BigDecimal productPrice;

    /**
    * 购买数量
    */
    @ApiModelProperty(value="购买数量")
    private Integer productQuantity;

    /**
    * 商品sku编号
    */
    @ApiModelProperty(value="商品sku编号")
    private Long productSkuId;

    /**
    * 商品sku条码
    */
    @ApiModelProperty(value="商品sku条码")
    private String productSkuCode;

    /**
    * 商品分类id
    */
    @ApiModelProperty(value="商品分类id")
    private Long productCategoryId;

    /**
    * 商品促销名称
    */
    @ApiModelProperty(value="商品促销名称")
    private String promotionName;

    /**
    * 商品促销分解金额
    */
    @ApiModelProperty(value="商品促销分解金额")
    private BigDecimal promotionAmount;

    /**
    * 优惠券优惠分解金额
    */
    @ApiModelProperty(value="优惠券优惠分解金额")
    private BigDecimal couponAmount;

    /**
    * 积分优惠分解金额
    */
    @ApiModelProperty(value="积分优惠分解金额")
    private BigDecimal integrationAmount;

    /**
    * 该商品经过优惠后的分解金额
    */
    @ApiModelProperty(value="该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @ApiModelProperty(value="")
    private Integer giftIntegration;

    @ApiModelProperty(value="")
    private Integer giftGrowth;

    /**
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    */
    @ApiModelProperty(value="商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}