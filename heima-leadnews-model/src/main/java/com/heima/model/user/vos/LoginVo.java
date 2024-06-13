package com.heima.model.user.vos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginVo {
    /**
     * 用户名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像
     */
    private String image;

    /**
     * token
     */
    private String token;
}
