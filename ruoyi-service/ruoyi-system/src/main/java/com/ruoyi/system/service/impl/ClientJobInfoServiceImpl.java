package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientJobInfoMapper;
import com.ruoyi.system.domain.ClientJobInfo;
import com.ruoyi.system.service.IClientJobInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户工作信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
@Service
public class ClientJobInfoServiceImpl implements IClientJobInfoService 
{
    @Autowired
    private ClientJobInfoMapper clientJobInfoMapper;

    /**
     * 查询客户工作信息
     * 
     * @param id 客户工作信息ID
     * @return 客户工作信息
     */
    @Override
    public ClientJobInfo selectClientJobInfoById(Long id)
    {
        return clientJobInfoMapper.selectClientJobInfoById(id);
    }

    /**
     * 查询客户工作信息列表
     * 
     * @param clientJobInfo 客户工作信息
     * @return 客户工作信息
     */
    @Override
    public List<ClientJobInfo> selectClientJobInfoList(ClientJobInfo clientJobInfo)
    {
        return clientJobInfoMapper.selectClientJobInfoList(clientJobInfo);
    }

    /**
     * 新增客户工作信息
     * 
     * @param clientJobInfo 客户工作信息
     * @return 结果
     */
    @Override
    public int insertClientJobInfo(ClientJobInfo clientJobInfo)
    {
        clientJobInfo.setCreateTime(DateUtils.getNowDate());
        return clientJobInfoMapper.insertClientJobInfo(clientJobInfo);
    }

    /**
     * 修改客户工作信息
     * 
     * @param clientJobInfo 客户工作信息
     * @return 结果
     */
    @Override
    public int updateClientJobInfo(ClientJobInfo clientJobInfo)
    {
        clientJobInfo.setUpdateTime(DateUtils.getNowDate());
        return clientJobInfoMapper.updateClientJobInfo(clientJobInfo);
    }

    /**
     * 删除客户工作信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientJobInfoByIds(String ids)
    {
        return clientJobInfoMapper.deleteClientJobInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户工作信息信息
     * 
     * @param id 客户工作信息ID
     * @return 结果
     */
    public int deleteClientJobInfoById(Long id)
    {
        return clientJobInfoMapper.deleteClientJobInfoById(id);
    }
}
