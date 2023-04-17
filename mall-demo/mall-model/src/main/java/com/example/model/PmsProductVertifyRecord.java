package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 商品审核记录
    */
@ApiModel(description="商品审核记录")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductVertifyRecord implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Date createTime;

    /**
    * 审核人
    */
    @ApiModelProperty(value="审核人")
    private String vertifyMan;

    @ApiModelProperty(value="")
    private Integer status;

    /**
    * 反馈详情
    */
    @ApiModelProperty(value="反馈详情")
    private String detail;

    private static final long serialVersionUID = 1L;
}