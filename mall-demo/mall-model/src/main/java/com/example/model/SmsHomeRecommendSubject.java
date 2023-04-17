package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 首页推荐专题表
    */
@ApiModel(description="首页推荐专题表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeRecommendSubject implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long subjectId;

    @ApiModelProperty(value="")
    private String subjectName;

    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}