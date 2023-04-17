package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户和标签关系表
    */
@ApiModel(description="用户和标签关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberMemberTagRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Long tagId;

    private static final long serialVersionUID = 1L;
}