package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientMailListMapper;
import com.ruoyi.system.domain.ClientMailList;
import com.ruoyi.system.service.IClientMailListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户通讯录Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
@Service
public class ClientMailListServiceImpl implements IClientMailListService 
{
    @Autowired
    private ClientMailListMapper clientMailListMapper;

    /**
     * 查询客户通讯录
     * 
     * @param id 客户通讯录ID
     * @return 客户通讯录
     */
    @Override
    public ClientMailList selectClientMailListById(Long id)
    {
        return clientMailListMapper.selectClientMailListById(id);
    }

    /**
     * 查询客户通讯录列表
     * 
     * @param clientMailList 客户通讯录
     * @return 客户通讯录
     */
    @Override
    public List<ClientMailList> selectClientMailListList(ClientMailList clientMailList)
    {
        return clientMailListMapper.selectClientMailListList(clientMailList);
    }

    /**
     * 新增客户通讯录
     * 
     * @param clientMailList 客户通讯录
     * @return 结果
     */
    @Override
    public int insertClientMailList(ClientMailList clientMailList)
    {
        clientMailList.setCreateTime(DateUtils.getNowDate());
        return clientMailListMapper.insertClientMailList(clientMailList);
    }

    /**
     * 修改客户通讯录
     * 
     * @param clientMailList 客户通讯录
     * @return 结果
     */
    @Override
    public int updateClientMailList(ClientMailList clientMailList)
    {
        clientMailList.setUpdateTime(DateUtils.getNowDate());
        return clientMailListMapper.updateClientMailList(clientMailList);
    }

    /**
     * 删除客户通讯录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientMailListByIds(String ids)
    {
        return clientMailListMapper.deleteClientMailListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户通讯录信息
     * 
     * @param id 客户通讯录ID
     * @return 结果
     */
    public int deleteClientMailListById(Long id)
    {
        return clientMailListMapper.deleteClientMailListById(id);
    }
}
