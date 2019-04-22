package com.unionman.springbootsecurityauth2.enums;

import lombok.ToString;

/**
 * @description: 数据信息状态枚举类
 * @author Rong.Jia
 * @date 2019/02/19 15:54:22
 */
@ToString
public enum ResponseEnum {



    /**
     * 0 表示返回成功
     */
    SUCCESS(0,"成功"),

    /**
     * 表示接口调用方异常提示
     */
    ACCESS_TOKEN_INVALID(1001,"access_token无效"),
    REFRESH_TOKEN_INVALID(1002,"refresh_token无效"),
    INSUFFICIENT_PERMISSIONS(1003,"该用户权限不足以访问该资源接口"),
    UNAUTHORIZED(1004,"访问此资源需要完全的身份验证"),


    /**
     * 5000 表示用户提示信息
     */
    INCORRECT_PARAMS(5000, "参数不正确"),
    ;
    private Integer code;
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
