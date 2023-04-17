package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 存储产品参数信息的表
    */
@ApiModel(description="存储产品参数信息的表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductAttributeValue implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Long productAttributeId;

    /**
    * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    */
    @ApiModelProperty(value="手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

    private static final long serialVersionUID = 1L;
}