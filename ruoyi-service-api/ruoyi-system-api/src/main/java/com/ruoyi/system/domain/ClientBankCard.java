package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户银行卡对象 client_bank_card
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public class ClientBankCard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long cid;

    /** 卡号 */
    @Excel(name = "卡号")
    private String cardNum;

    /** 银行卡类型 */
    @Excel(name = "银行卡类型")
    private String bankType;

    /** 类型 */
    @Excel(name = "类型")
    private String cardType;

    /** 行别码 */
    @Excel(name = "行别码")
    private String bankCd;

    /** 银行名称 */
    @Excel(name = "银行名称")
    private String bankName;

    /** 业主姓名 */
    @Excel(name = "业主姓名")
    private String ownerName;

    /** 开户支行 */
    @Excel(name = "开户支行")
    private String bankName2;

    /** 开户行地址 */
    @Excel(name = "开户行地址")
    private String bankAddress;

    /** 城市代码 */
    @Excel(name = "城市代码")
    private String cityno;

    /** 银行卡图片地址 */
    @Excel(name = "银行卡图片地址")
    private String bankImgUrl;

    /** 银行预留手机号 */
    @Excel(name = "银行预留手机号")
    private String reservedPhone;

    /** 是否为绑定卡 0否 1是 */
    @Excel(name = "是否为绑定卡 0否 1是")
    private Integer cgStatus;

    /** 是否是默认卡  1是  0否 */
    @Excel(name = "是否是默认卡  1是  0否")
    private Integer defaultStatus;

    /** 富友对应项目ID */
    @Excel(name = "富友对应项目ID")
    private String projectId;

    /** $column.columnComment */
    @Excel(name = "富友对应项目ID")
    private Integer status;

    /** 操作IP */
    @Excel(name = "操作IP")
    private String operationIp;

    /** 协议支付协议号 */
    @Excel(name = "协议支付协议号")
    private String firstProjectId;

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
    public void setCardNum(String cardNum) 
    {
        this.cardNum = cardNum;
    }

    public String getCardNum() 
    {
        return cardNum;
    }
    public void setBankType(String bankType) 
    {
        this.bankType = bankType;
    }

    public String getBankType() 
    {
        return bankType;
    }
    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }
    public void setBankCd(String bankCd) 
    {
        this.bankCd = bankCd;
    }

    public String getBankCd() 
    {
        return bankCd;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }
    public void setBankName2(String bankName2) 
    {
        this.bankName2 = bankName2;
    }

    public String getBankName2() 
    {
        return bankName2;
    }
    public void setBankAddress(String bankAddress) 
    {
        this.bankAddress = bankAddress;
    }

    public String getBankAddress() 
    {
        return bankAddress;
    }
    public void setCityno(String cityno) 
    {
        this.cityno = cityno;
    }

    public String getCityno() 
    {
        return cityno;
    }
    public void setBankImgUrl(String bankImgUrl) 
    {
        this.bankImgUrl = bankImgUrl;
    }

    public String getBankImgUrl() 
    {
        return bankImgUrl;
    }
    public void setReservedPhone(String reservedPhone) 
    {
        this.reservedPhone = reservedPhone;
    }

    public String getReservedPhone() 
    {
        return reservedPhone;
    }
    public void setCgStatus(Integer cgStatus) 
    {
        this.cgStatus = cgStatus;
    }

    public Integer getCgStatus() 
    {
        return cgStatus;
    }
    public void setDefaultStatus(Integer defaultStatus) 
    {
        this.defaultStatus = defaultStatus;
    }

    public Integer getDefaultStatus() 
    {
        return defaultStatus;
    }
    public void setProjectId(String projectId) 
    {
        this.projectId = projectId;
    }

    public String getProjectId() 
    {
        return projectId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setOperationIp(String operationIp) 
    {
        this.operationIp = operationIp;
    }

    public String getOperationIp() 
    {
        return operationIp;
    }
    public void setFirstProjectId(String firstProjectId) 
    {
        this.firstProjectId = firstProjectId;
    }

    public String getFirstProjectId() 
    {
        return firstProjectId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("cardNum", getCardNum())
            .append("bankType", getBankType())
            .append("cardType", getCardType())
            .append("bankCd", getBankCd())
            .append("bankName", getBankName())
            .append("ownerName", getOwnerName())
            .append("bankName2", getBankName2())
            .append("bankAddress", getBankAddress())
            .append("cityno", getCityno())
            .append("bankImgUrl", getBankImgUrl())
            .append("reservedPhone", getReservedPhone())
            .append("cgStatus", getCgStatus())
            .append("defaultStatus", getDefaultStatus())
            .append("projectId", getProjectId())
            .append("status", getStatus())
            .append("operationIp", getOperationIp())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("firstProjectId", getFirstProjectId())
            .toString();
    }
}
