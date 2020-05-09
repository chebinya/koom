package com.koom.service;

import com.koom.entity.Admin;

import java.util.List;

/**
 * @ClassName IAdminService
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:41
 * @Version 1.0
 */
public interface IAdminService {
    /**
     * 查询所有
     * @return
     */
    List<Admin> finAll();

    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    Admin checkAdmin(String account,String password);

    /**
     * 新增管理员账号
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);
}
