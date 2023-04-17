package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 优选专区和产品关系表
    */
@ApiModel(description="优选专区和产品关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsPrefrenceAreaProductRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long prefrenceAreaId;

    @ApiModelProperty(value="")
    private Long productId;

    private static final long serialVersionUID = 1L;
}