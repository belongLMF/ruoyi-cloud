package com.ruoyi.system.service;

import com.ruoyi.system.domain.RyTaobao;
import java.util.List;

/**
 * 淘宝认证Service接口
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
public interface IRyTaobaoService 
{
    /**
     * 查询淘宝认证
     * 
     * @param id 淘宝认证ID
     * @return 淘宝认证
     */
    public RyTaobao selectRyTaobaoById(Long id);

    /**
     * 查询淘宝认证列表
     * 
     * @param ryTaobao 淘宝认证
     * @return 淘宝认证集合
     */
    public List<RyTaobao> selectRyTaobaoList(RyTaobao ryTaobao);

    /**
     * 新增淘宝认证
     * 
     * @param ryTaobao 淘宝认证
     * @return 结果
     */
    public int insertRyTaobao(RyTaobao ryTaobao);

    /**
     * 修改淘宝认证
     * 
     * @param ryTaobao 淘宝认证
     * @return 结果
     */
    public int updateRyTaobao(RyTaobao ryTaobao);

    /**
     * 批量删除淘宝认证
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRyTaobaoByIds(String ids);

    /**
     * 删除淘宝认证信息
     * 
     * @param id 淘宝认证ID
     * @return 结果
     */
    public int deleteRyTaobaoById(Long id);
}
