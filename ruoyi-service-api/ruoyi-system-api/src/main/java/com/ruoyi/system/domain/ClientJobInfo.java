package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 客户工作信息对象 client_job_info
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public class ClientJobInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long cid;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String corporateName;

    /** 单位性质 */
    @Excel(name = "单位性质")
    private Long corporateAttr;

    /** 所属行业 */
    @Excel(name = "所属行业")
    private Long corporateIndustry;

    /** 单位地址 */
    @Excel(name = "单位地址")
    private String corporateAddress;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private String corporateDepartment;

    /** 担任职务 */
    @Excel(name = "担任职务")
    private String corporatePost;

    /** 公积金 */
    @Excel(name = "公积金")
    private String fundInfo;

    /** 社保 */
    @Excel(name = "社保")
    private String socialSecurity;

    /** 入职时间 */
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entryTime;

    /** 单位电话 */
    @Excel(name = "单位电话")
    private String corporatePhone;

    /** $column.columnComment */
    @Excel(name = "单位电话", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setCorporateName(String corporateName) 
    {
        this.corporateName = corporateName;
    }

    public String getCorporateName() 
    {
        return corporateName;
    }
    public void setCorporateAttr(Long corporateAttr) 
    {
        this.corporateAttr = corporateAttr;
    }

    public Long getCorporateAttr() 
    {
        return corporateAttr;
    }
    public void setCorporateIndustry(Long corporateIndustry) 
    {
        this.corporateIndustry = corporateIndustry;
    }

    public Long getCorporateIndustry() 
    {
        return corporateIndustry;
    }
    public void setCorporateAddress(String corporateAddress) 
    {
        this.corporateAddress = corporateAddress;
    }

    public String getCorporateAddress() 
    {
        return corporateAddress;
    }
    public void setCorporateDepartment(String corporateDepartment) 
    {
        this.corporateDepartment = corporateDepartment;
    }

    public String getCorporateDepartment() 
    {
        return corporateDepartment;
    }
    public void setCorporatePost(String corporatePost) 
    {
        this.corporatePost = corporatePost;
    }

    public String getCorporatePost() 
    {
        return corporatePost;
    }
    public void setFundInfo(String fundInfo) 
    {
        this.fundInfo = fundInfo;
    }

    public String getFundInfo() 
    {
        return fundInfo;
    }
    public void setSocialSecurity(String socialSecurity) 
    {
        this.socialSecurity = socialSecurity;
    }

    public String getSocialSecurity() 
    {
        return socialSecurity;
    }
    public void setEntryTime(Date entryTime) 
    {
        this.entryTime = entryTime;
    }

    public Date getEntryTime() 
    {
        return entryTime;
    }
    public void setCorporatePhone(String corporatePhone) 
    {
        this.corporatePhone = corporatePhone;
    }

    public String getCorporatePhone() 
    {
        return corporatePhone;
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
            .append("corporateName", getCorporateName())
            .append("corporateAttr", getCorporateAttr())
            .append("corporateIndustry", getCorporateIndustry())
            .append("corporateAddress", getCorporateAddress())
            .append("corporateDepartment", getCorporateDepartment())
            .append("corporatePost", getCorporatePost())
            .append("fundInfo", getFundInfo())
            .append("socialSecurity", getSocialSecurity())
            .append("entryTime", getEntryTime())
            .append("corporatePhone", getCorporatePhone())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deleteTime", getDeleteTime())
            .toString();
    }
}
