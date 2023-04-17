package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台用户和角色关系表
    */
@ApiModel(description="后台用户和角色关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsAdminRoleRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}