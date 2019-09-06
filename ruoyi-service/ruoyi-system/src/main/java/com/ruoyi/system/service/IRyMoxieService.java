package com.ruoyi.system.service;

import com.ruoyi.system.domain.RyMoxie;
import java.util.List;

/**
 * 魔蝎认证Service接口
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
public interface IRyMoxieService 
{
    /**
     * 查询魔蝎认证
     * 
     * @param id 魔蝎认证ID
     * @return 魔蝎认证
     */
    public RyMoxie selectRyMoxieById(Long id);

    /**
     * 查询魔蝎认证列表
     * 
     * @param ryMoxie 魔蝎认证
     * @return 魔蝎认证集合
     */
    public List<RyMoxie> selectRyMoxieList(RyMoxie ryMoxie);

    /**
     * 新增魔蝎认证
     * 
     * @param ryMoxie 魔蝎认证
     * @return 结果
     */
    public int insertRyMoxie(RyMoxie ryMoxie);

    /**
     * 修改魔蝎认证
     * 
     * @param ryMoxie 魔蝎认证
     * @return 结果
     */
    public int updateRyMoxie(RyMoxie ryMoxie);

    /**
     * 批量删除魔蝎认证
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRyMoxieByIds(String ids);

    /**
     * 删除魔蝎认证信息
     * 
     * @param id 魔蝎认证ID
     * @return 结果
     */
    public int deleteRyMoxieById(Long id);
}
