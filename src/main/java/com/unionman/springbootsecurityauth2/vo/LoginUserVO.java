package com.unionman.springbootsecurityauth2.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @description 用户登录后返回参数对象
 * @author Zhifeng.Zeng
 * @date 2019/3/7
 */
@Setter
@Getter
@ToString
public class LoginUserVO {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * accessToken码
     */
    private String accessToken;

    /**
     * accessToken是否过期
     */
    private Boolean expired;

    /**
     * accessToken到期时间
     */
    private String accessTokenExpiration;

    /**
     * accessToken过期时限
     */
    private Integer accessTokenExpiresIn;

    /**
     * 使用范围
     */
    private List<String> scope;

    /**
     * token类型
     */
    private String tokenType;

    /**
     * refreshToken到期时间
     */
    private String refreshTokenExpiration;


    /**
     * refreshToken码
     */
    private String refreshToken;


}
