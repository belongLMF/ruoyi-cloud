package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RyTaobaoMapper;
import com.ruoyi.system.domain.RyTaobao;
import com.ruoyi.system.service.IRyTaobaoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 淘宝认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
@Service
public class RyTaobaoServiceImpl implements IRyTaobaoService 
{
    @Autowired
    private RyTaobaoMapper ryTaobaoMapper;

    /**
     * 查询淘宝认证
     * 
     * @param id 淘宝认证ID
     * @return 淘宝认证
     */
    @Override
    public RyTaobao selectRyTaobaoById(Long id)
    {
        return ryTaobaoMapper.selectRyTaobaoById(id);
    }

    /**
     * 查询淘宝认证列表
     * 
     * @param ryTaobao 淘宝认证
     * @return 淘宝认证
     */
    @Override
    public List<RyTaobao> selectRyTaobaoList(RyTaobao ryTaobao)
    {
        return ryTaobaoMapper.selectRyTaobaoList(ryTaobao);
    }

    /**
     * 新增淘宝认证
     * 
     * @param ryTaobao 淘宝认证
     * @return 结果
     */
    @Override
    public int insertRyTaobao(RyTaobao ryTaobao)
    {
        ryTaobao.setCreateTime(DateUtils.getNowDate());
        return ryTaobaoMapper.insertRyTaobao(ryTaobao);
    }

    /**
     * 修改淘宝认证
     * 
     * @param ryTaobao 淘宝认证
     * @return 结果
     */
    @Override
    public int updateRyTaobao(RyTaobao ryTaobao)
    {
        ryTaobao.setUpdateTime(DateUtils.getNowDate());
        return ryTaobaoMapper.updateRyTaobao(ryTaobao);
    }

    /**
     * 删除淘宝认证对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRyTaobaoByIds(String ids)
    {
        return ryTaobaoMapper.deleteRyTaobaoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除淘宝认证信息
     * 
     * @param id 淘宝认证ID
     * @return 结果
     */
    public int deleteRyTaobaoById(Long id)
    {
        return ryTaobaoMapper.deleteRyTaobaoById(id);
    }
}
