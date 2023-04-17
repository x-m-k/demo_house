package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 商品会员价格表
    */
@ApiModel(description="商品会员价格表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsMemberPrice implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
    * 会员价格
    */
    @ApiModelProperty(value="会员价格")
    private BigDecimal memberPrice;

    @ApiModelProperty(value="")
    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}