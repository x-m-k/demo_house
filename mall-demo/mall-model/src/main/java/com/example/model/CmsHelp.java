package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 帮助表
    */
@ApiModel(description="帮助表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsHelp implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long categoryId;

    @ApiModelProperty(value="")
    private String icon;

    @ApiModelProperty(value="")
    private String title;

    @ApiModelProperty(value="")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer readCount;

    @ApiModelProperty(value="")
    private String content;

    private static final long serialVersionUID = 1L;
}