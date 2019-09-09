package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 客户通讯录对象 client_mail_list
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public class ClientMailList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long cid;

    /** 本次申请code */
    @Excel(name = "本次申请code")
    private String applyCode;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String contactName;

    /** 人际关系 */
    @Excel(name = "人际关系")
    private Integer contactRelation;

    /** 联系人手机号 */
    @Excel(name = "联系人手机号")
    private String contactPhone;

    /** 省市区信息 */
    @Excel(name = "省市区信息")
    private String contactLocation;

    /** 联系人地址 可能会弃用 */
    @Excel(name = "联系人地址 可能会弃用")
    private String contactAddress;

    /** 添加类型：1app添加 2客户手动添加3后台添加 */
    @Excel(name = "添加类型：1app添加 2客户手动添加3后台添加")
    private Integer addType;

    /** 状态：1正常  0无效 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "添加类型：1app添加 2客户手动添加3后台添加", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setApplyCode(String applyCode) 
    {
        this.applyCode = applyCode;
    }

    public String getApplyCode() 
    {
        return applyCode;
    }
    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }
    public void setContactRelation(Integer contactRelation) 
    {
        this.contactRelation = contactRelation;
    }

    public Integer getContactRelation() 
    {
        return contactRelation;
    }
    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }
    public void setContactLocation(String contactLocation) 
    {
        this.contactLocation = contactLocation;
    }

    public String getContactLocation() 
    {
        return contactLocation;
    }
    public void setContactAddress(String contactAddress) 
    {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress() 
    {
        return contactAddress;
    }
    public void setAddType(Integer addType) 
    {
        this.addType = addType;
    }

    public Integer getAddType() 
    {
        return addType;
    }
    public void setDeleteTime(Date deleteTime) 
    {
        this.deleteTime = deleteTime;
    }

    public Date getDeleteTime() 
    {
        return deleteTime;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("applyCode", getApplyCode())
            .append("contactName", getContactName())
            .append("contactRelation", getContactRelation())
            .append("contactPhone", getContactPhone())
            .append("contactLocation", getContactLocation())
            .append("contactAddress", getContactAddress())
            .append("addType", getAddType())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deleteTime", getDeleteTime())
            .toString();
    }
}
