package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RyClientMapper;
import com.ruoyi.system.domain.RyClient;
import com.ruoyi.system.service.IRyClientService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-04
 */
@Service
public class RyClientServiceImpl implements IRyClientService 
{
    @Autowired
    private RyClientMapper ryClientMapper;

    /**
     * 查询客户
     * 
     * @param id 客户ID
     * @return 客户
     */
    @Override
    public RyClient selectRyClientById(Long id)
    {
        return ryClientMapper.selectRyClientById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param ryClient 客户
     * @return 客户
     */
    @Override
    public List<RyClient> selectRyClientList(RyClient ryClient)
    {
        return ryClientMapper.selectRyClientList(ryClient);
    }

    /**
     * 新增客户
     * 
     * @param ryClient 客户
     * @return 结果
     */
    @Override
    public int insertRyClient(RyClient ryClient)
    {
        ryClient.setCreateTime(DateUtils.getNowDate());
        return ryClientMapper.insertRyClient(ryClient);
    }

    /**
     * 修改客户
     * 
     * @param ryClient 客户
     * @return 结果
     */
    @Override
    public int updateRyClient(RyClient ryClient)
    {
        ryClient.setUpdateTime(DateUtils.getNowDate());
        return ryClientMapper.updateRyClient(ryClient);
    }

    /**
     * 删除客户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRyClientByIds(String ids)
    {
        return ryClientMapper.deleteRyClientByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户ID
     * @return 结果
     */
    public int deleteRyClientById(Long id)
    {
        return ryClientMapper.deleteRyClientById(id);
    }
}
