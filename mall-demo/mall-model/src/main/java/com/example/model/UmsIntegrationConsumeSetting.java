package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 积分消费设置
    */
@ApiModel(description="积分消费设置")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsIntegrationConsumeSetting implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 每一元需要抵扣的积分数量
    */
    @ApiModelProperty(value="每一元需要抵扣的积分数量")
    private Integer deductionPerAmount;

    /**
    * 每笔订单最高抵用百分比
    */
    @ApiModelProperty(value="每笔订单最高抵用百分比")
    private Integer maxPercentPerOrder;

    /**
    * 每次使用积分最小单位100
    */
    @ApiModelProperty(value="每次使用积分最小单位100")
    private Integer useUnit;

    /**
    * 是否可以和优惠券同用；0->不可以；1->可以
    */
    @ApiModelProperty(value="是否可以和优惠券同用；0->不可以；1->可以")
    private Integer couponStatus;

    private static final long serialVersionUID = 1L;
}