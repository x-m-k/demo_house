package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 订单设置表
    */
@ApiModel(description="订单设置表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderSetting implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 秒杀订单超时关闭时间(分)
    */
    @ApiModelProperty(value="秒杀订单超时关闭时间(分)")
    private Integer flashOrderOvertime;

    /**
    * 正常订单超时时间(分)
    */
    @ApiModelProperty(value="正常订单超时时间(分)")
    private Integer normalOrderOvertime;

    /**
    * 发货后自动确认收货时间（天）
    */
    @ApiModelProperty(value="发货后自动确认收货时间（天）")
    private Integer confirmOvertime;

    /**
    * 自动完成交易时间，不能申请售后（天）
    */
    @ApiModelProperty(value="自动完成交易时间，不能申请售后（天）")
    private Integer finishOvertime;

    /**
    * 订单完成后自动好评时间（天）
    */
    @ApiModelProperty(value="订单完成后自动好评时间（天）")
    private Integer commentOvertime;

    private static final long serialVersionUID = 1L;
}