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
    * 订单退货申请
    */
@ApiModel(description="订单退货申请")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderReturnApply implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 订单id
    */
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
    * 收货地址表id
    */
    @ApiModelProperty(value="收货地址表id")
    private Long companyAddressId;

    /**
    * 退货商品id
    */
    @ApiModelProperty(value="退货商品id")
    private Long productId;

    /**
    * 订单编号
    */
    @ApiModelProperty(value="订单编号")
    private String orderSn;

    /**
    * 申请时间
    */
    @ApiModelProperty(value="申请时间")
    private Date createTime;

    /**
    * 会员用户名
    */
    @ApiModelProperty(value="会员用户名")
    private String memberUsername;

    /**
    * 退款金额
    */
    @ApiModelProperty(value="退款金额")
    private BigDecimal returnAmount;

    /**
    * 退货人姓名
    */
    @ApiModelProperty(value="退货人姓名")
    private String returnName;

    /**
    * 退货人电话
    */
    @ApiModelProperty(value="退货人电话")
    private String returnPhone;

    /**
    * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
    */
    @ApiModelProperty(value="申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    /**
    * 处理时间
    */
    @ApiModelProperty(value="处理时间")
    private Date handleTime;

    /**
    * 商品图片
    */
    @ApiModelProperty(value="商品图片")
    private String productPic;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品品牌
    */
    @ApiModelProperty(value="商品品牌")
    private String productBrand;

    /**
    * 商品销售属性：颜色：红色；尺码：xl;
    */
    @ApiModelProperty(value="商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    /**
    * 退货数量
    */
    @ApiModelProperty(value="退货数量")
    private Integer productCount;

    /**
    * 商品单价
    */
    @ApiModelProperty(value="商品单价")
    private BigDecimal productPrice;

    /**
    * 商品实际支付单价
    */
    @ApiModelProperty(value="商品实际支付单价")
    private BigDecimal productRealPrice;

    /**
    * 原因
    */
    @ApiModelProperty(value="原因")
    private String reason;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 凭证图片，以逗号隔开
    */
    @ApiModelProperty(value="凭证图片，以逗号隔开")
    private String proofPics;

    /**
    * 处理备注
    */
    @ApiModelProperty(value="处理备注")
    private String handleNote;

    /**
    * 处理人员
    */
    @ApiModelProperty(value="处理人员")
    private String handleMan;

    /**
    * 收货人
    */
    @ApiModelProperty(value="收货人")
    private String receiveMan;

    /**
    * 收货时间
    */
    @ApiModelProperty(value="收货时间")
    private Date receiveTime;

    /**
    * 收货备注
    */
    @ApiModelProperty(value="收货备注")
    private String receiveNote;

    private static final long serialVersionUID = 1L;
}