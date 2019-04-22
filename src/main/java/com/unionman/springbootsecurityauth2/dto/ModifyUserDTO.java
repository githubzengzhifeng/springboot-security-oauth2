package com.unionman.springbootsecurityauth2.dto;

import lombok.Data;

/**
 * @description 用户修改密码传输参数
 * @author Zhifeng.Zeng
 * @date 2019/4/19 14:26
 */
@Data
public class ModifyUserDTO {

    /**
     * 原密码
     */
    String oldPassword;

    /**
     * 新密码
     */
    String newPassword;
}
