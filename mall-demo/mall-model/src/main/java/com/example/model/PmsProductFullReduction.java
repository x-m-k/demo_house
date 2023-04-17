package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 产品满减表(只针对同商品)
    */
@ApiModel(description="产品满减表(只针对同商品)")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductFullReduction implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private BigDecimal fullPrice;

    @ApiModelProperty(value="")
    private BigDecimal reducePrice;

    private static final long serialVersionUID = 1L;
}