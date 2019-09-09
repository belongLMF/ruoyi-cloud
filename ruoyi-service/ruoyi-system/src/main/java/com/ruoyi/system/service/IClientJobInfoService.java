package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientJobInfo;
import java.util.List;

/**
 * 客户工作信息Service接口
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public interface IClientJobInfoService 
{
    /**
     * 查询客户工作信息
     * 
     * @param id 客户工作信息ID
     * @return 客户工作信息
     */
    public ClientJobInfo selectClientJobInfoById(Long id);

    /**
     * 查询客户工作信息
     *
     * @param cid 客户ID
     * @return 客户工作信息
     */
    public ClientJobInfo selectClientJobInfoByCid(Long cid);

    /**
     * 查询客户工作信息列表
     * 
     * @param clientJobInfo 客户工作信息
     * @return 客户工作信息集合
     */
    public List<ClientJobInfo> selectClientJobInfoList(ClientJobInfo clientJobInfo);

    /**
     * 新增客户工作信息
     * 
     * @param clientJobInfo 客户工作信息
     * @return 结果
     */
    public int insertClientJobInfo(ClientJobInfo clientJobInfo);

    /**
     * 修改客户工作信息
     * 
     * @param clientJobInfo 客户工作信息
     * @return 结果
     */
    public int updateClientJobInfo(ClientJobInfo clientJobInfo);

    /**
     * 批量删除客户工作信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientJobInfoByIds(String ids);

    /**
     * 删除客户工作信息信息
     * 
     * @param id 客户工作信息ID
     * @return 结果
     */
    public int deleteClientJobInfoById(Long id);
}
