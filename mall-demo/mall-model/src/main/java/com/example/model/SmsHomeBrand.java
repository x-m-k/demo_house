package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 首页推荐品牌表
    */
@ApiModel(description="首页推荐品牌表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeBrand implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long brandId;

    @ApiModelProperty(value="")
    private String brandName;

    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}