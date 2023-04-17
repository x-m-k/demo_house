package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户标签表
    */
@ApiModel(description="用户标签表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberTag implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 自动打标签完成订单数量
    */
    @ApiModelProperty(value="自动打标签完成订单数量")
    private Integer finishOrderCount;

    /**
    * 自动打标签完成订单金额
    */
    @ApiModelProperty(value="自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;
}