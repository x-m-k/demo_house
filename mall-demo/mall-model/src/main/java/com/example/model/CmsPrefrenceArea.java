package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 优选专区
    */
@ApiModel(description="优选专区")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsPrefrenceArea implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String subTitle;

    /**
    * 展示图片
    */
    @ApiModelProperty(value="展示图片")
    private byte[] pic;

    @ApiModelProperty(value="")
    private Integer sort;

    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}