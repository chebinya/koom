package com.koom.controller;

import com.koom.entity.Admin;
import com.koom.service.impl.AdminServiceImpl;
import com.koom.utils.ResultBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:42
 * @Version 1.0
 */
@Controller
@RequestMapping("/kadmin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/login.action")
    private String toAdmin() {
        return "login";
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll.action")
    @ResponseBody
    public ResultBean findAll() {
        List<Admin> admins = adminService.finAll();
        return ResultBean.result(1, "查询成功", admins, true);
    }

    /**
     * 登录校验
     * @param request
     * @param account
     * @param password
     * @return
     */
    @RequestMapping(value = "checkAdmin.action", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean checkAdmin(HttpServletRequest request,  String account, String password) {
        HttpSession session = request.getSession();
        Admin admin = adminService.checkAdmin(account, password);
        System.out.println(admin);
        if (admin != null) {
            session.setAttribute("admin", admin);
           return ResultBean.result(1, "登录成功", null, true);
        } else {
            return ResultBean.result(0, "账号或密码错误", null, false);
        }

    }

    /**
     * admin新增
     * @param admin
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean addAdmin(Admin admin) {
        int i = adminService.addAdmin(admin);
        if (i>0){
         return    ResultBean.result(1,"新增成功",null,true);
        }else {
         return    ResultBean.result(0,"新增失败",null,false);
        }

    }



    /**
     * 登录跳转index
     * @return
     */
    @RequestMapping("/index.action")
    public String index(){
        return "index";
    }

    /**
     * 跳转home
     * @return
     */
    @RequestMapping("/home.action")
    public String home(){
        return "home/home";
    }

    /**
     * 跳转用户管理
     * @return
     */
    @RequestMapping("/amaccount.action")
    public String amaccount(){
        return "acctoun/amaccount";
    }
}
