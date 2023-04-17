package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台菜单表
    */
@ApiModel(description="后台菜单表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMenu implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 父级ID
    */
    @ApiModelProperty(value="父级ID")
    private Long parentId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 菜单名称
    */
    @ApiModelProperty(value="菜单名称")
    private String title;

    /**
    * 菜单级数
    */
    @ApiModelProperty(value="菜单级数")
    private Integer level;

    /**
    * 菜单排序
    */
    @ApiModelProperty(value="菜单排序")
    private Integer sort;

    /**
    * 前端名称
    */
    @ApiModelProperty(value="前端名称")
    private String name;

    /**
    * 前端图标
    */
    @ApiModelProperty(value="前端图标")
    private String icon;

    /**
    * 前端隐藏
    */
    @ApiModelProperty(value="前端隐藏")
    private Integer hidden;

    private static final long serialVersionUID = 1L;
}