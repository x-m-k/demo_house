package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 产品分类
    */
@ApiModel(description="产品分类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 上机分类的编号：0表示一级分类
    */
    @ApiModelProperty(value="上机分类的编号：0表示一级分类")
    private Long parentId;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 分类级别：0->1级；1->2级
    */
    @ApiModelProperty(value="分类级别：0->1级；1->2级")
    private Integer level;

    @ApiModelProperty(value="")
    private Integer productCount;

    @ApiModelProperty(value="")
    private String productUnit;

    /**
    * 是否显示在导航栏：0->不显示；1->显示
    */
    @ApiModelProperty(value="是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    /**
    * 显示状态：0->不显示；1->显示
    */
    @ApiModelProperty(value="显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    /**
    * 图标
    */
    @ApiModelProperty(value="图标")
    private String icon;

    @ApiModelProperty(value="")
    private String keywords;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    private static final long serialVersionUID = 1L;
}