package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 客户对象 ry_client
 *
 * @author ruoyi
 * @date 2019-09-04
 */
public class RyClient extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 手机号
     */
    @Excel(name = "手机号")
    private String phone;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String name;

    /**
     * 身份证
     */
    @Excel(name = "身份证")
    private String idcard;

    /**
     * 性别
     */
    @Excel(name = "性别")
    private String sex;

    /**
     * 出生日期
     */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthDate;

    /**
     * 年龄
     */
    @Excel(name = "年龄")
    private int age;

    /**
     * 认证状态
     */
    @Excel(name = "认证状态")
    private String authStatus;

    /**
     * 来源渠道
     */
    @Excel(name = "来源渠道")
    private String sources;

    /**
     * 来源分类
     */
    @Excel(name = "来源分类")
    private String sourceType;

    /**
     * 推荐人
     */
    @Excel(name = "推荐人")
    private String referrerId;

    /**
     * 推荐人名称
     */
    @Excel(name = "推荐人名称")
    private String referrerName;

    /**
     * 账户状态
     */
    @Excel(name = "账户状态")
    private String status;

    /**
     * 注册时间
     */
    @Excel(name = "注册时间", dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date registrationTime;

    /**
     * 最后一次登录时间
     */
    @Excel(name = "最后一次登录时间", dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lastTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getAge() {
        return age;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getSources() {
        return sources;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    public String getReferrerId() {
        return referrerId;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getRegistrationTime() {
        return this.registrationTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Date getLastTime() {
        return this.lastTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("phone", getPhone())
                .append("name", getName())
                .append("idcard", getIdcard())
                .append("sex", getSex())
                .append("birthDate", getBirthDate())
                .append("age", getAge())
                .append("authStatus", getAuthStatus())
                .append("sources", getSources())
                .append("sourceType", getSourceType())
                .append("referrerId", getReferrerId())
                .append("referrerName", getReferrerName())
                .append("status", getStatus())
                .append("lastTime", getLastTime())
                .append("registrationTime", getRegistrationTime())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
