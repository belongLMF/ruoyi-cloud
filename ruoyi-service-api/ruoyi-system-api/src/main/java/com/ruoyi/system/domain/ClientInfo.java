package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 客户基本信息对象 client_info
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public class ClientInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long cid;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private Integer marriage;

    /** 学历 */
    @Excel(name = "学历")
    private Long education;

    /** 民族 */
    @Excel(name = "民族")
    private String nation;

    /** 职业类型 */
    @Excel(name = "职业类型")
    private Long careerType;

    /** 家庭供养人数 */
    @Excel(name = "家庭供养人数")
    private Long familySize;

    /** 住宅类型 */
    @Excel(name = "住宅类型")
    private Long residentialType;

    /** 住宅电话 */
    @Excel(name = "住宅电话")
    private String homePhone;

    /** QQ */
    @Excel(name = "QQ")
    private String qq;

    /** 微信 */
    @Excel(name = "微信")
    private String wechat;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 籍贯地址 */
    @Excel(name = "籍贯地址")
    private String nativePlace;

    /** 籍贯地址邮编 */
    @Excel(name = "籍贯地址邮编")
    private String nativePlaceCode;

    /** 居住地址 */
    @Excel(name = "居住地址")
    private String address;

    /** 居住地址邮编 */
    @Excel(name = "居住地址邮编")
    private String addressCode;

    /** 个人描述 */
    @Excel(name = "个人描述")
    private String describe;

    /** 紧急联系人 */
    @Excel(name = "紧急联系人")
    private String emergencyContact;

    /** 紧急联系人手机号 */
    @Excel(name = "紧急联系人手机号")
    private String emergencyContactPhone;

    /** 紧急联系人居住地址 */
    @Excel(name = "紧急联系人居住地址")
    private String emergencyContactAddress;

    /** $column.columnComment */
    @Excel(name = "紧急联系人居住地址", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deleteTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setMarriage(Integer marriage) 
    {
        this.marriage = marriage;
    }

    public Integer getMarriage() 
    {
        return marriage;
    }
    public void setEducation(Long education) 
    {
        this.education = education;
    }

    public Long getEducation() 
    {
        return education;
    }
    public void setNation(String nation) 
    {
        this.nation = nation;
    }

    public String getNation() 
    {
        return nation;
    }
    public void setCareerType(Long careerType) 
    {
        this.careerType = careerType;
    }

    public Long getCareerType() 
    {
        return careerType;
    }
    public void setFamilySize(Long familySize) 
    {
        this.familySize = familySize;
    }

    public Long getFamilySize() 
    {
        return familySize;
    }
    public void setResidentialType(Long residentialType) 
    {
        this.residentialType = residentialType;
    }

    public Long getResidentialType() 
    {
        return residentialType;
    }
    public void setHomePhone(String homePhone) 
    {
        this.homePhone = homePhone;
    }

    public String getHomePhone() 
    {
        return homePhone;
    }
    public void setQq(String qq) 
    {
        this.qq = qq;
    }

    public String getQq() 
    {
        return qq;
    }
    public void setWechat(String wechat) 
    {
        this.wechat = wechat;
    }

    public String getWechat() 
    {
        return wechat;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setNativePlace(String nativePlace) 
    {
        this.nativePlace = nativePlace;
    }

    public String getNativePlace() 
    {
        return nativePlace;
    }
    public void setNativePlaceCode(String nativePlaceCode) 
    {
        this.nativePlaceCode = nativePlaceCode;
    }

    public String getNativePlaceCode() 
    {
        return nativePlaceCode;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setAddressCode(String addressCode) 
    {
        this.addressCode = addressCode;
    }

    public String getAddressCode() 
    {
        return addressCode;
    }
    public void setDescribe(String describe) 
    {
        this.describe = describe;
    }

    public String getDescribe() 
    {
        return describe;
    }
    public void setEmergencyContact(String emergencyContact) 
    {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContact() 
    {
        return emergencyContact;
    }
    public void setEmergencyContactPhone(String emergencyContactPhone) 
    {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactPhone() 
    {
        return emergencyContactPhone;
    }
    public void setEmergencyContactAddress(String emergencyContactAddress) 
    {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    public String getEmergencyContactAddress() 
    {
        return emergencyContactAddress;
    }
    public void setDeleteTime(Date deleteTime) 
    {
        this.deleteTime = deleteTime;
    }

    public Date getDeleteTime() 
    {
        return deleteTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("marriage", getMarriage())
            .append("education", getEducation())
            .append("nation", getNation())
            .append("careerType", getCareerType())
            .append("familySize", getFamilySize())
            .append("residentialType", getResidentialType())
            .append("homePhone", getHomePhone())
            .append("qq", getQq())
            .append("wechat", getWechat())
            .append("email", getEmail())
            .append("nativePlace", getNativePlace())
            .append("nativePlaceCode", getNativePlaceCode())
            .append("address", getAddress())
            .append("addressCode", getAddressCode())
            .append("describe", getDescribe())
            .append("emergencyContact", getEmergencyContact())
            .append("emergencyContactPhone", getEmergencyContactPhone())
            .append("emergencyContactAddress", getEmergencyContactAddress())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deleteTime", getDeleteTime())
            .toString();
    }
}
