package com.unionman.springbootsecurityauth2.enums;

/**
 * @description: url 枚举类
 * @author: Rong.Jia
 * @date: 2019/02/28 09:22:22
 */
public enum UrlEnum {

    //oauth2登录
    LOGIN_URL("/oauth/token"),

    ;

    private String url;

    UrlEnum(String url) {
        this.url = url;

    }


    public String getUrl() {
        return url;
    }
}
