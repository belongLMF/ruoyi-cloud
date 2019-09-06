package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RyOperatorMapper;
import com.ruoyi.system.domain.RyOperator;
import com.ruoyi.system.service.IRyOperatorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 运营商认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
@Service
public class RyOperatorServiceImpl implements IRyOperatorService 
{
    @Autowired
    private RyOperatorMapper ryOperatorMapper;

    /**
     * 查询运营商认证
     * 
     * @param id 运营商认证ID
     * @return 运营商认证
     */
    @Override
    public RyOperator selectRyOperatorById(Long id)
    {
        return ryOperatorMapper.selectRyOperatorById(id);
    }

    /**
     * 查询运营商认证列表
     * 
     * @param ryOperator 运营商认证
     * @return 运营商认证
     */
    @Override
    public List<RyOperator> selectRyOperatorList(RyOperator ryOperator)
    {
        return ryOperatorMapper.selectRyOperatorList(ryOperator);
    }

    /**
     * 新增运营商认证
     * 
     * @param ryOperator 运营商认证
     * @return 结果
     */
    @Override
    public int insertRyOperator(RyOperator ryOperator)
    {
        ryOperator.setCreateTime(DateUtils.getNowDate());
        return ryOperatorMapper.insertRyOperator(ryOperator);
    }

    /**
     * 修改运营商认证
     * 
     * @param ryOperator 运营商认证
     * @return 结果
     */
    @Override
    public int updateRyOperator(RyOperator ryOperator)
    {
        ryOperator.setUpdateTime(DateUtils.getNowDate());
        return ryOperatorMapper.updateRyOperator(ryOperator);
    }

    /**
     * 删除运营商认证对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRyOperatorByIds(String ids)
    {
        return ryOperatorMapper.deleteRyOperatorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除运营商认证信息
     * 
     * @param id 运营商认证ID
     * @return 结果
     */
    public int deleteRyOperatorById(Long id)
    {
        return ryOperatorMapper.deleteRyOperatorById(id);
    }
}
