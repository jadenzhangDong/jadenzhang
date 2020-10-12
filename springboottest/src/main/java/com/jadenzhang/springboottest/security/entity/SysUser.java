package com.jadenzhang.springboottest.security.entity;

import org.springframework.data.annotation.Transient;
import sun.tools.java.Type;

import java.util.Date;

public class SysUser extends BaseEntity{

    private static final long serialVersionUID = 50466553720186170L;

//    @Excel(name = "用户序号", cellType = ColumnType.NUMERIC, prompt = "用户编号")
    private Long userId;

    //@Excel(name = "部门编号", type = Type.IMPORT)
    private Long deptId;

    //@Excel(name = "登录名称")
    private String userName;

//    @Excel(name = "用户名称")
    private String nickName;

//    @Excel(name = "用户邮箱")
    private String email;

//    @Excel(name = "手机号码")
    private String phonenumber;

//    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

//    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

//    @Excel(name = "最后登陆IP", type = Type.EXPORT)
    private String loginIp;

//    @Excel(name = "最后登陆时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Type.EXPORT)
    private Date loginDate;

//    @Excels({
//            @Excel(name = "部门名称", targetAttr = "deptName", type = Type.EXPORT),
//            @Excel(name = "部门负责人", targetAttr = "leader", type = Type.EXPORT)
//    })
//    @Transient
//    private SysDept dept;

    /** 角色对象 */
//    @Transient
//    private List<SysRole> roles;

    /** 角色组 */
    @Transient
    private Long[] roleIds;

    /** 岗位组 */
    @Transient
    private Long[] postIds;
}
