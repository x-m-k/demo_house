package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台用户角色和权限关系表
    */
@ApiModel(description="后台用户角色和权限关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsRolePermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long roleId;

    @ApiModelProperty(value="")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}