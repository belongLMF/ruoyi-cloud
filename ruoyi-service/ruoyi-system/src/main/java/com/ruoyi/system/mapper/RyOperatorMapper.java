package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.RyOperator;
import java.util.List;

/**
 * 运营商认证Mapper接口
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
public interface RyOperatorMapper 
{
    /**
     * 查询运营商认证
     * 
     * @param id 运营商认证ID
     * @return 运营商认证
     */
    public RyOperator selectRyOperatorById(Long id);

    /**
     * 查询运营商认证列表
     * 
     * @param ryOperator 运营商认证
     * @return 运营商认证集合
     */
    public List<RyOperator> selectRyOperatorList(RyOperator ryOperator);

    /**
     * 新增运营商认证
     * 
     * @param ryOperator 运营商认证
     * @return 结果
     */
    public int insertRyOperator(RyOperator ryOperator);

    /**
     * 修改运营商认证
     * 
     * @param ryOperator 运营商认证
     * @return 结果
     */
    public int updateRyOperator(RyOperator ryOperator);

    /**
     * 删除运营商认证
     * 
     * @param id 运营商认证ID
     * @return 结果
     */
    public int deleteRyOperatorById(Long id);

    /**
     * 批量删除运营商认证
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRyOperatorByIds(String[] ids);
}
