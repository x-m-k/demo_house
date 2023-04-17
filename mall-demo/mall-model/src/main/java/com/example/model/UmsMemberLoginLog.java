package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 会员登录记录
    */
@ApiModel(description="会员登录记录")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberLoginLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String ip;

    @ApiModelProperty(value="")
    private String city;

    /**
    * 登录类型：0->PC；1->android;2->ios;3->小程序
    */
    @ApiModelProperty(value="登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @ApiModelProperty(value="")
    private String province;

    private static final long serialVersionUID = 1L;
}