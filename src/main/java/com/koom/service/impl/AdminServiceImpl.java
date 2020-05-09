package com.koom.service.impl;

import com.koom.dao.IAdminDao;
import com.koom.entity.Admin;
import com.koom.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName IAdminServiceImpl
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:41
 * @Version 1.0
 */
@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDao adminDao;

    @Override
    public List<Admin> finAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin checkAdmin(String account, String password) {
        return adminDao.checkAdmin(account,password);
    }

    @Override
    public int addAdmin(Admin admin) {

        return adminDao.addAdmin(admin);

    }

}
