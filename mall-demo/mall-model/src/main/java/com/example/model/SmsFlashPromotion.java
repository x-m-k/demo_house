package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 限时购表
    */
@ApiModel(description="限时购表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsFlashPromotion implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 秒杀时间段名称
    */
    @ApiModelProperty(value="秒杀时间段名称")
    private String title;

    /**
    * 开始日期
    */
    @ApiModelProperty(value="开始日期")
    private Date startDate;

    /**
    * 结束日期
    */
    @ApiModelProperty(value="结束日期")
    private Date endDate;

    /**
    * 上下线状态
    */
    @ApiModelProperty(value="上下线状态")
    private Integer status;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}