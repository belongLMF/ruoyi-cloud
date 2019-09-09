package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientFinaceMapper;
import com.ruoyi.system.domain.ClientFinace;
import com.ruoyi.system.service.IClientFinaceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户财务Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
@Service
public class ClientFinaceServiceImpl implements IClientFinaceService 
{
    @Autowired
    private ClientFinaceMapper clientFinaceMapper;

    /**
     * 查询客户财务
     * 
     * @param id 客户财务ID
     * @return 客户财务
     */
    @Override
    public ClientFinace selectClientFinaceById(Long id)
    {
        return clientFinaceMapper.selectClientFinaceById(id);
    }

    /**
     * 查询客户财务列表
     * 
     * @param clientFinace 客户财务
     * @return 客户财务
     */
    @Override
    public List<ClientFinace> selectClientFinaceList(ClientFinace clientFinace)
    {
        return clientFinaceMapper.selectClientFinaceList(clientFinace);
    }

    /**
     * 查询客户财务单条
     *
     * @param clientFinace
     * @return
     */
    @Override
    public List<ClientFinace> selectClientFinaceData(ClientFinace clientFinace)
    {
        return clientFinaceMapper.selectClientFinaceData(clientFinace);
    }

    /**
     * 新增客户财务
     * 
     * @param clientFinace 客户财务
     * @return 结果
     */
    @Override
    public int insertClientFinace(ClientFinace clientFinace)
    {
        clientFinace.setCreateTime(DateUtils.getNowDate());
        return clientFinaceMapper.insertClientFinace(clientFinace);
    }

    /**
     * 修改客户财务
     * 
     * @param clientFinace 客户财务
     * @return 结果
     */
    @Override
    public int updateClientFinace(ClientFinace clientFinace)
    {
        clientFinace.setUpdateTime(DateUtils.getNowDate());
        return clientFinaceMapper.updateClientFinace(clientFinace);
    }

    /**
     * 删除客户财务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientFinaceByIds(String ids)
    {
        return clientFinaceMapper.deleteClientFinaceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户财务信息
     * 
     * @param id 客户财务ID
     * @return 结果
     */
    public int deleteClientFinaceById(Long id)
    {
        return clientFinaceMapper.deleteClientFinaceById(id);
    }
}
