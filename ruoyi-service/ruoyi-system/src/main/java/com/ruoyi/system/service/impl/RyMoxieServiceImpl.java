package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RyMoxieMapper;
import com.ruoyi.system.domain.RyMoxie;
import com.ruoyi.system.service.IRyMoxieService;
import com.ruoyi.common.core.text.Convert;

/**
 * 魔蝎认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
@Service
public class RyMoxieServiceImpl implements IRyMoxieService 
{
    @Autowired
    private RyMoxieMapper ryMoxieMapper;

    /**
     * 查询魔蝎认证
     * 
     * @param id 魔蝎认证ID
     * @return 魔蝎认证
     */
    @Override
    public RyMoxie selectRyMoxieById(Long id)
    {
        return ryMoxieMapper.selectRyMoxieById(id);
    }

    /**
     * 查询魔蝎认证列表
     * 
     * @param ryMoxie 魔蝎认证
     * @return 魔蝎认证
     */
    @Override
    public List<RyMoxie> selectRyMoxieList(RyMoxie ryMoxie)
    {
        return ryMoxieMapper.selectRyMoxieList(ryMoxie);
    }

    /**
     * 新增魔蝎认证
     * 
     * @param ryMoxie 魔蝎认证
     * @return 结果
     */
    @Override
    public int insertRyMoxie(RyMoxie ryMoxie)
    {
        ryMoxie.setCreateTime(DateUtils.getNowDate());
        return ryMoxieMapper.insertRyMoxie(ryMoxie);
    }

    /**
     * 修改魔蝎认证
     * 
     * @param ryMoxie 魔蝎认证
     * @return 结果
     */
    @Override
    public int updateRyMoxie(RyMoxie ryMoxie)
    {
        ryMoxie.setUpdateTime(DateUtils.getNowDate());
        return ryMoxieMapper.updateRyMoxie(ryMoxie);
    }

    /**
     * 删除魔蝎认证对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRyMoxieByIds(String ids)
    {
        return ryMoxieMapper.deleteRyMoxieByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除魔蝎认证信息
     * 
     * @param id 魔蝎认证ID
     * @return 结果
     */
    public int deleteRyMoxieById(Long id)
    {
        return ryMoxieMapper.deleteRyMoxieById(id);
    }
}
