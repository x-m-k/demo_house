package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 产品评价回复表
    */
@ApiModel(description="产品评价回复表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsCommentReplay implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long commentId;

    @ApiModelProperty(value="")
    private String memberNickName;

    @ApiModelProperty(value="")
    private String memberIcon;

    @ApiModelProperty(value="")
    private String content;

    @ApiModelProperty(value="")
    private Date createTime;

    /**
    * 评论人员类型；0->会员；1->管理员
    */
    @ApiModelProperty(value="评论人员类型；0->会员；1->管理员")
    private Integer type;

    private static final long serialVersionUID = 1L;
}