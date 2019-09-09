package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientInfoMapper;
import com.ruoyi.system.domain.ClientInfo;
import com.ruoyi.system.service.IClientInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
@Service
public class ClientInfoServiceImpl implements IClientInfoService
{
    @Autowired
    private ClientInfoMapper clientInfoMapper;

    /**
     * 查询客户基本信息
     * 
     * @param id 客户基本信息ID
     * @return 客户基本信息
     */
    @Override
    public ClientInfo selectClientInfoById(Long id)
    {
        return clientInfoMapper.selectClientInfoById(id);
    }

    /**
     * 查询客户基本信息
     *
     * @param cid 客户基本信息ID
     * @return 客户基本信息
     */
    @Override
    public ClientInfo selectClientInfoByCid(Long cid)
    {
        return clientInfoMapper.selectClientInfoByCid(cid);
    }

    /**
     * 查询客户基本信息列表
     * 
     * @param clientInfo 客户基本信息
     * @return 客户基本信息
     */
    @Override
    public List<ClientInfo> selectClientInfoList(ClientInfo clientInfo)
    {
        return clientInfoMapper.selectClientInfoList(clientInfo);
    }

    /**
     * 新增客户基本信息
     * 
     * @param clientInfo 客户基本信息
     * @return 结果
     */
    @Override
    public int insertClientInfo(ClientInfo clientInfo)
    {
        clientInfo.setCreateTime(DateUtils.getNowDate());
        return clientInfoMapper.insertClientInfo(clientInfo);
    }

    /**
     * 修改客户基本信息
     * 
     * @param clientInfo 客户基本信息
     * @return 结果
     */
    @Override
    public int updateClientInfo(ClientInfo clientInfo)
    {
        clientInfo.setUpdateTime(DateUtils.getNowDate());
        return clientInfoMapper.updateClientInfo(clientInfo);
    }

    /**
     * 删除客户基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientInfoByIds(String ids)
    {
        return clientInfoMapper.deleteClientInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户基本信息信息
     * 
     * @param id 客户基本信息ID
     * @return 结果
     */
    public int deleteClientInfoById(Long id)
    {
        return clientInfoMapper.deleteClientInfoById(id);
    }
}
