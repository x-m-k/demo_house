package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户举报表
    */
@ApiModel(description="用户举报表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsMemberReport implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 举报类型：0->商品评价；1->话题内容；2->用户评论
    */
    @ApiModelProperty(value="举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    /**
    * 举报人
    */
    @ApiModelProperty(value="举报人")
    private String reportMemberName;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String reportObject;

    /**
    * 举报状态：0->未处理；1->已处理
    */
    @ApiModelProperty(value="举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    /**
    * 处理结果：0->无效；1->有效；2->恶意
    */
    @ApiModelProperty(value="处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    @ApiModelProperty(value="")
    private String note;

    private static final long serialVersionUID = 1L;
}