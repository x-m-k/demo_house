package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 后台角色资源关系表
    */
@ApiModel(description="后台角色资源关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsRoleResourceRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 角色ID
    */
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
    * 资源ID
    */
    @ApiModelProperty(value="资源ID")
    private Long resourceId;

    private static final long serialVersionUID = 1L;
}