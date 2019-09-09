package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.ClientInfo;
import java.util.List;

/**
 * 客户基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public interface ClientInfoMapper 
{
    /**
     * 查询客户基本信息
     * 
     * @param id 客户基本信息ID
     * @return 客户基本信息
     */
    public ClientInfo selectClientInfoById(Long id);

    /**
     * 根据客户id查询客户基本信息
     *
     * @param cid 客户基本信息ID
     * @return 客户基本信息
     */
    public ClientInfo selectClientInfoByCid(Long cid);

    /**
     * 查询客户基本信息列表
     * 
     * @param clientInfo 客户基本信息
     * @return 客户基本信息集合
     */
    public List<ClientInfo> selectClientInfoList(ClientInfo clientInfo);

    /**
     * 新增客户基本信息
     * 
     * @param clientInfo 客户基本信息
     * @return 结果
     */
    public int insertClientInfo(ClientInfo clientInfo);

    /**
     * 修改客户基本信息
     * 
     * @param clientInfo 客户基本信息
     * @return 结果
     */
    public int updateClientInfo(ClientInfo clientInfo);

    /**
     * 删除客户基本信息
     * 
     * @param id 客户基本信息ID
     * @return 结果
     */
    public int deleteClientInfoById(Long id);

    /**
     * 批量删除客户基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientInfoByIds(String[] ids);
}
