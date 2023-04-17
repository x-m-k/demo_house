package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 会员收货地址表
    */
@ApiModel(description="会员收货地址表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberReceiveAddress implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    /**
    * 收货人名称
    */
    @ApiModelProperty(value="收货人名称")
    private String name;

    @ApiModelProperty(value="")
    private String phoneNumber;

    /**
    * 是否为默认
    */
    @ApiModelProperty(value="是否为默认")
    private Integer defaultStatus;

    /**
    * 邮政编码
    */
    @ApiModelProperty(value="邮政编码")
    private String postCode;

    /**
    * 省份/直辖市
    */
    @ApiModelProperty(value="省份/直辖市")
    private String province;

    /**
    * 城市
    */
    @ApiModelProperty(value="城市")
    private String city;

    /**
    * 区
    */
    @ApiModelProperty(value="区")
    private String region;

    /**
    * 详细地址(街道)
    */
    @ApiModelProperty(value="详细地址(街道)")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}