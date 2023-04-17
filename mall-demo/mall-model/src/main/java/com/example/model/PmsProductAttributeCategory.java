package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 产品属性分类表
    */
@ApiModel(description="产品属性分类表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductAttributeCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 属性数量
    */
    @ApiModelProperty(value="属性数量")
    private Integer attributeCount;

    /**
    * 参数数量
    */
    @ApiModelProperty(value="参数数量")
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}