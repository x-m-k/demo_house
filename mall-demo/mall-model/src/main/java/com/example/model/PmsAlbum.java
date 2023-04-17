package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 相册表
    */
@ApiModel(description="相册表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsAlbum implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String coverPic;

    @ApiModelProperty(value="")
    private Integer picCount;

    @ApiModelProperty(value="")
    private Integer sort;

    @ApiModelProperty(value="")
    private String description;

    private static final long serialVersionUID = 1L;
}