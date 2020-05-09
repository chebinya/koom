package com.koom.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @ClassName Admin
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:37
 * @Version 1.0
 */
public class Admin {

    /**
     * 管理员id
     */
    private Integer id;

    /**
     * 管理员账号
     */
    private String account;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 头像
     */
    private String urlAvatar;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date  createDate;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date upDate;

    /**
     * 管理员账号
     */
    private Integer status;

    /**
     *管理员ip
     */
    private String ip;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", urlAvatar='" + urlAvatar + '\'' +
                ", createDate=" + createDate +
                ", upDate=" + upDate +
                ", status=" + status +
                ", ip='" + ip + '\'' +
                '}';
    }
}
