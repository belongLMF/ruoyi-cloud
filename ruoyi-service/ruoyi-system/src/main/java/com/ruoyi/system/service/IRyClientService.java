package com.ruoyi.system.service;

import com.ruoyi.system.domain.RyClient;

import java.util.List;

/**
 * 客户Service接口
 *
 * @author ruoyi
 * @date 2019-09-04
 */
public interface IRyClientService {
    /**
     * 查询客户
     *
     * @param id 客户ID
     * @return 客户
     */
    public RyClient selectRyClientById(Long id);

    /**
     * 查询客户列表
     *
     * @param ryClient 客户
     * @return 客户集合
     */
    public List<RyClient> selectRyClientList(RyClient ryClient);

    /**
     * 新增客户
     *
     * @param ryClient 客户
     * @return 结果
     */
    public int insertRyClient(RyClient ryClient);

    /**
     * 修改客户
     *
     * @param ryClient 客户
     * @return 结果
     */
    public int updateRyClient(RyClient ryClient);

    /**
     * 批量删除客户
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRyClientByIds(String ids);

    /**
     * 删除客户信息
     *
     * @param id 客户ID
     * @return 结果
     */
    public int deleteRyClientById(Long id);
}
