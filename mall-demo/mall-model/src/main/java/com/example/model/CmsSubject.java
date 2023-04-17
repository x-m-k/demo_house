package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 专题表
    */
@ApiModel(description="专题表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubject implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long categoryId;

    @ApiModelProperty(value="")
    private String title;

    /**
    * 专题主图
    */
    @ApiModelProperty(value="专题主图")
    private String pic;

    /**
    * 关联产品数量
    */
    @ApiModelProperty(value="关联产品数量")
    private Integer productCount;

    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer collectCount;

    @ApiModelProperty(value="")
    private Integer readCount;

    @ApiModelProperty(value="")
    private Integer commentCount;

    /**
    * 画册图片用逗号分割
    */
    @ApiModelProperty(value="画册图片用逗号分割")
    private String albumPics;

    @ApiModelProperty(value="")
    private String description;

    /**
    * 显示状态：0->不显示；1->显示
    */
    @ApiModelProperty(value="显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private String content;

    /**
    * 转发数
    */
    @ApiModelProperty(value="转发数")
    private Integer forwardCount;

    /**
    * 专题分类名称
    */
    @ApiModelProperty(value="专题分类名称")
    private String categoryName;

    private static final long serialVersionUID = 1L;
}