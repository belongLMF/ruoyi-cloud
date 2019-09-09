package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户财务对象 client_finace
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public class ClientFinace extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long cid;

    /** 月均收入 */
    @Excel(name = "月均收入")
    private Double income;

    /** 收入构成描述 */
    @Excel(name = "收入构成描述")
    private String incomeInfo;

    /** 月均支出 */
    @Excel(name = "月均支出")
    private Double expenditure;

    /** 支出构成描述 */
    @Excel(name = "支出构成描述")
    private String expenditureInfo;

    /** 参股企业 */
    @Excel(name = "参股企业")
    private String sharesInfo;

    /** 参股金额 */
    @Excel(name = "参股金额")
    private Double sharesMoney;

    /** 其他资产 */
    @Excel(name = "其他资产")
    private String otherAssets;

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
    public void setIncome(Double income) 
    {
        this.income = income;
    }

    public Double getIncome() 
    {
        return income;
    }
    public void setIncomeInfo(String incomeInfo) 
    {
        this.incomeInfo = incomeInfo;
    }

    public String getIncomeInfo() 
    {
        return incomeInfo;
    }
    public void setExpenditure(Double expenditure) 
    {
        this.expenditure = expenditure;
    }

    public Double getExpenditure() 
    {
        return expenditure;
    }
    public void setExpenditureInfo(String expenditureInfo) 
    {
        this.expenditureInfo = expenditureInfo;
    }

    public String getExpenditureInfo() 
    {
        return expenditureInfo;
    }
    public void setSharesInfo(String sharesInfo) 
    {
        this.sharesInfo = sharesInfo;
    }

    public String getSharesInfo() 
    {
        return sharesInfo;
    }
    public void setSharesMoney(Double sharesMoney) 
    {
        this.sharesMoney = sharesMoney;
    }

    public Double getSharesMoney() 
    {
        return sharesMoney;
    }
    public void setOtherAssets(String otherAssets) 
    {
        this.otherAssets = otherAssets;
    }

    public String getOtherAssets() 
    {
        return otherAssets;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("income", getIncome())
            .append("incomeInfo", getIncomeInfo())
            .append("expenditure", getExpenditure())
            .append("expenditureInfo", getExpenditureInfo())
            .append("sharesInfo", getSharesInfo())
            .append("sharesMoney", getSharesMoney())
            .append("otherAssets", getOtherAssets())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
