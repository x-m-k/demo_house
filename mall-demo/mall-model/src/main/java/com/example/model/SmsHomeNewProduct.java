package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 新鲜好物表
    */
@ApiModel(description="新鲜好物表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeNewProduct implements Serializable {
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