package com.dili.demo.domain;

import com.dili.ss.domain.annotation.Like;
import com.dili.ss.dto.IBaseDomain;
import com.dili.ss.metadata.FieldEditor;
import com.dili.ss.metadata.annotation.EditMode;
import com.dili.ss.metadata.annotation.FieldDef;

import javax.persistence.*;
import java.util.Date;

/**
 * 由MyBatis Generator工具自动生成
 * 用户
 * This file was generated on 2021-06-04 10:40:26.
 */
@Table(name = "`user`")
public interface User extends IBaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`")
    @FieldDef(label="主键")
    @EditMode(editor = FieldEditor.Number, required = true)
    Long getId();

    void setId(Long id);

    @Column(name = "`username`")
    @FieldDef(label="用户名", maxLength = 50)
    @EditMode(editor = FieldEditor.Text, required = true)
    @Like
    String getUsername();

    void setUsername(String username);

    @Column(name = "`password`")
    @FieldDef(label="密码", maxLength = 128)
    @EditMode(editor = FieldEditor.Text, required = true)
    String getPassword();

    void setPassword(String password);

    @Column(name = "`state`")
    @FieldDef(label="状态")
    @EditMode(editor = FieldEditor.Combo, required = true, params="{\"data\":[{\"text\":\"启用\",\"value\":1},{\"text\":\"停用\",\"value\":0}]}")
    Integer getState();

    void setState(Integer state);

    @Column(name = "`gender`")
    @FieldDef(label="性别")
    @EditMode(editor = FieldEditor.Text, required = false)
    Integer getGender();

    void setGender(Integer gender);

    @Column(name = "`point`")
    @FieldDef(label="积分")
    @EditMode(editor = FieldEditor.Number, required = false)
    Integer getPoint();

    void setPoint(Integer point);

    @Column(name = "`cellphone`")
    @FieldDef(label="手机号码", maxLength = 24)
    @EditMode(editor = FieldEditor.Text, required = false)
    String getCellphone();

    void setCellphone(String cellphone);

    @Column(name = "`is_admin`")
    @FieldDef(label="是否管理员")
    @EditMode(editor = FieldEditor.Text, required = false)
    Boolean getIsAdmin();

    void setIsAdmin(Boolean isAdmin);

    @Column(name = "`description`")
    @FieldDef(label="备注", maxLength = 255)
    @EditMode(editor = FieldEditor.Text, required = false)
    String getDescription();

    void setDescription(String description);

    @Column(name = "`created`")
    @FieldDef(label="创建时间")
    @EditMode(editor = FieldEditor.Datetime, required = true)
    Date getCreated();

    void setCreated(Date created);

    @Column(name = "`modified`")
    @FieldDef(label="修改时间")
    @EditMode(editor = FieldEditor.Datetime, required = true)
    Date getModified();

    void setModified(Date modified);

    @Column(name = "`last_login_time`")
    @FieldDef(label="最后登录时间")
    @EditMode(editor = FieldEditor.Datetime, required = true)
    Date getLastLoginTime();
    void setLastLoginTime(Date lastLoginTime);
}