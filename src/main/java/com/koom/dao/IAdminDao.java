package com.koom.dao;

import com.koom.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName IAdminDao
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:40
 * @Version 1.0
 */
public interface IAdminDao {

    /**
     * 查询所有
     * @return
     */
    List<Admin> findAll();

    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    Admin checkAdmin(@Param("account") String account,@Param("password") String password);

    /**
     * 新增管理员账号
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);


}
