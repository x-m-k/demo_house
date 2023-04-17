package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 会员统计信息
    */
@ApiModel(description="会员统计信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberStatisticsInfo implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    /**
    * 累计消费金额
    */
    @ApiModelProperty(value="累计消费金额")
    private BigDecimal consumeAmount;

    /**
    * 订单数量
    */
    @ApiModelProperty(value="订单数量")
    private Integer orderCount;

    /**
    * 优惠券数量
    */
    @ApiModelProperty(value="优惠券数量")
    private Integer couponCount;

    /**
    * 评价数
    */
    @ApiModelProperty(value="评价数")
    private Integer commentCount;

    /**
    * 退货数量
    */
    @ApiModelProperty(value="退货数量")
    private Integer returnOrderCount;

    /**
    * 登录次数
    */
    @ApiModelProperty(value="登录次数")
    private Integer loginCount;

    /**
    * 关注数量
    */
    @ApiModelProperty(value="关注数量")
    private Integer attendCount;

    /**
    * 粉丝数量
    */
    @ApiModelProperty(value="粉丝数量")
    private Integer fansCount;

    @ApiModelProperty(value="")
    private Integer collectProductCount;

    @ApiModelProperty(value="")
    private Integer collectSubjectCount;

    @ApiModelProperty(value="")
    private Integer collectTopicCount;

    @ApiModelProperty(value="")
    private Integer collectCommentCount;

    @ApiModelProperty(value="")
    private Integer inviteFriendCount;

    /**
    * 最后一次下订单时间
    */
    @ApiModelProperty(value="最后一次下订单时间")
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;
}