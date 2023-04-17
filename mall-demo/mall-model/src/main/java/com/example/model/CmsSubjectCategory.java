package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 专题分类表
    */
@ApiModel(description="专题分类表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubjectCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 分类图标
    */
    @ApiModelProperty(value="分类图标")
    private String icon;

    /**
    * 专题数量
    */
    @ApiModelProperty(value="专题数量")
    private Integer subjectCount;

    @ApiModelProperty(value="")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}