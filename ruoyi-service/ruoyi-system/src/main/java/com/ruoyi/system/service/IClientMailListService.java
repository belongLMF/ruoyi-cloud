package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientMailList;
import java.util.List;

/**
 * 客户通讯录Service接口
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public interface IClientMailListService 
{
    /**
     * 查询客户通讯录
     * 
     * @param id 客户通讯录ID
     * @return 客户通讯录
     */
    public ClientMailList selectClientMailListById(Long id);

    /**
     * 查询客户通讯录列表
     * 
     * @param clientMailList 客户通讯录
     * @return 客户通讯录集合
     */
    public List<ClientMailList> selectClientMailListList(ClientMailList clientMailList);

    /**
     * 新增客户通讯录
     * 
     * @param clientMailList 客户通讯录
     * @return 结果
     */
    public int insertClientMailList(ClientMailList clientMailList);

    /**
     * 修改客户通讯录
     * 
     * @param clientMailList 客户通讯录
     * @return 结果
     */
    public int updateClientMailList(ClientMailList clientMailList);

    /**
     * 批量删除客户通讯录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientMailListByIds(String ids);

    /**
     * 删除客户通讯录信息
     * 
     * @param id 客户通讯录ID
     * @return 结果
     */
    public int deleteClientMailListById(Long id);
}
