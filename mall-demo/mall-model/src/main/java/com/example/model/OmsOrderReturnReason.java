package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 退货原因表
    */
@ApiModel(description="退货原因表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderReturnReason implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 退货类型
    */
    @ApiModelProperty(value="退货类型")
    private String name;

    @ApiModelProperty(value="")
    private Integer sort;

    /**
    * 状态：0->不启用；1->启用
    */
    @ApiModelProperty(value="状态：0->不启用；1->启用")
    private Integer status;

    /**
    * 添加时间
    */
    @ApiModelProperty(value="添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}