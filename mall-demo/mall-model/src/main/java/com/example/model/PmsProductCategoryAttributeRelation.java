package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
    */
@ApiModel(description="产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductCategoryAttributeRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    @ApiModelProperty(value="")
    private Long productAttributeId;

    private static final long serialVersionUID = 1L;
}