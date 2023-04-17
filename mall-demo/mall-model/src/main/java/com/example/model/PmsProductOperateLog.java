package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="pms_product_operate_log")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductOperateLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private BigDecimal priceOld;

    @ApiModelProperty(value="")
    private BigDecimal priceNew;

    @ApiModelProperty(value="")
    private BigDecimal salePriceOld;

    @ApiModelProperty(value="")
    private BigDecimal salePriceNew;

    /**
    * 赠送的积分
    */
    @ApiModelProperty(value="赠送的积分")
    private Integer giftPointOld;

    @ApiModelProperty(value="")
    private Integer giftPointNew;

    @ApiModelProperty(value="")
    private Integer usePointLimitOld;

    @ApiModelProperty(value="")
    private Integer usePointLimitNew;

    /**
    * 操作人
    */
    @ApiModelProperty(value="操作人")
    private String operateMan;

    @ApiModelProperty(value="")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}