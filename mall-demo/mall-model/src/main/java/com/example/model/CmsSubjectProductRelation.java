package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 专题商品关系表
    */
@ApiModel(description="专题商品关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubjectProductRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long subjectId;

    @ApiModelProperty(value="")
    private Long productId;

    private static final long serialVersionUID = 1L;
}