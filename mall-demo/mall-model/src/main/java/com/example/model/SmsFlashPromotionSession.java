package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 限时购场次表
    */
@ApiModel(description="限时购场次表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsFlashPromotionSession implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 场次名称
    */
    @ApiModelProperty(value="场次名称")
    private String name;

    /**
    * 每日开始时间
    */
    @ApiModelProperty(value="每日开始时间")
    private Date startTime;

    /**
    * 每日结束时间
    */
    @ApiModelProperty(value="每日结束时间")
    private Date endTime;

    /**
    * 启用状态：0->不启用；1->启用
    */
    @ApiModelProperty(value="启用状态：0->不启用；1->启用")
    private Integer status;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}