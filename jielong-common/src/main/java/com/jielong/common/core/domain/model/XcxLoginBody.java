package com.jielong.common.core.domain.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 小程序登录对象
 */
@Data
public class XcxLoginBody {
    @NotBlank(message = "{xcx.code.not.blank}")
    private String code;

    @NotBlank(message = "租户id不能为空")
    private String tenantId;

    private String openId;
}
