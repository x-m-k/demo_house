package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 商品限时购与商品关系表
    */
@ApiModel(description="商品限时购与商品关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsFlashPromotionProductRelation implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    @ApiModelProperty(value="")
    private Long flashPromotionId;

    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long flashPromotionSessionId;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * 限时购价格
    */
    @ApiModelProperty(value="限时购价格")
    private BigDecimal flashPromotionPrice;

    /**
    * 限时购数量
    */
    @ApiModelProperty(value="限时购数量")
    private Integer flashPromotionCount;

    /**
    * 每人限购数量
    */
    @ApiModelProperty(value="每人限购数量")
    private Integer flashPromotionLimit;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}