package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
    */
@ApiModel(description="后台用户和权限关系表(除角色中定义的权限以外的加减权限)")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsAdminPermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Long permissionId;

    @ApiModelProperty(value="")
    private Integer type;

    private static final long serialVersionUID = 1L;
}