package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 人气推荐商品表
    */
@ApiModel(description="人气推荐商品表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeRecommendProduct implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private String productName;

    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}