package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台用户登录日志表
    */
@ApiModel(description="后台用户登录日志表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsAdminLoginLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String ip;

    @ApiModelProperty(value="")
    private String address;

    /**
    * 浏览器登录类型
    */
    @ApiModelProperty(value="浏览器登录类型")
    private String userAgent;

    private static final long serialVersionUID = 1L;
}