package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 会员与产品分类关系表（用户喜欢的分类）
    */
@ApiModel(description="会员与产品分类关系表（用户喜欢的分类）")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberProductCategoryRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    private static final long serialVersionUID = 1L;
}