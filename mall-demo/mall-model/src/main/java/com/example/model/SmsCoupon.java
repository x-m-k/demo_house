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
    * 优惠券表
    */
@ApiModel(description="优惠券表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCoupon implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
    */
    @ApiModelProperty(value="优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 使用平台：0->全部；1->移动；2->PC
    */
    @ApiModelProperty(value="使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    /**
    * 数量
    */
    @ApiModelProperty(value="数量")
    private Integer count;

    /**
    * 金额
    */
    @ApiModelProperty(value="金额")
    private BigDecimal amount;

    /**
    * 每人限领张数
    */
    @ApiModelProperty(value="每人限领张数")
    private Integer perLimit;

    /**
    * 使用门槛；0表示无门槛
    */
    @ApiModelProperty(value="使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    @ApiModelProperty(value="")
    private Date startTime;

    @ApiModelProperty(value="")
    private Date endTime;

    /**
    * 使用类型：0->全场通用；1->指定分类；2->指定商品
    */
    @ApiModelProperty(value="使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String note;

    /**
    * 发行数量
    */
    @ApiModelProperty(value="发行数量")
    private Integer publishCount;

    /**
    * 已使用数量
    */
    @ApiModelProperty(value="已使用数量")
    private Integer useCount;

    /**
    * 领取数量
    */
    @ApiModelProperty(value="领取数量")
    private Integer receiveCount;

    /**
    * 可以领取的日期
    */
    @ApiModelProperty(value="可以领取的日期")
    private Date enableTime;

    /**
    * 优惠码
    */
    @ApiModelProperty(value="优惠码")
    private String code;

    /**
    * 可领取的会员类型：0->无限时
    */
    @ApiModelProperty(value="可领取的会员类型：0->无限时")
    private Integer memberLevel;

    private static final long serialVersionUID = 1L;
}