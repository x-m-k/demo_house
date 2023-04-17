package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 首页轮播广告表
    */
@ApiModel(description="首页轮播广告表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeAdvertise implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 轮播位置：0->PC首页轮播；1->app首页轮播
    */
    @ApiModelProperty(value="轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    @ApiModelProperty(value="")
    private String pic;

    @ApiModelProperty(value="")
    private Date startTime;

    @ApiModelProperty(value="")
    private Date endTime;

    /**
    * 上下线状态：0->下线；1->上线
    */
    @ApiModelProperty(value="上下线状态：0->下线；1->上线")
    private Integer status;

    /**
    * 点击数
    */
    @ApiModelProperty(value="点击数")
    private Integer clickCount;

    /**
    * 下单数
    */
    @ApiModelProperty(value="下单数")
    private Integer orderCount;

    /**
    * 链接地址
    */
    @ApiModelProperty(value="链接地址")
    private String url;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String note;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}