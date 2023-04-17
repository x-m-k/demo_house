package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 专题评论表
    */
@ApiModel(description="专题评论表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsTopicComment implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String memberNickName;

    @ApiModelProperty(value="")
    private Long topicId;

    @ApiModelProperty(value="")
    private String memberIcon;

    @ApiModelProperty(value="")
    private String content;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}