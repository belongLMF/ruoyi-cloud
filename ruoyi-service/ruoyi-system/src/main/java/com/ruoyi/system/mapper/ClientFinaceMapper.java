package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.ClientFinace;
import java.util.List;

/**
 * 客户财务Mapper接口
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public interface ClientFinaceMapper 
{
    /**
     * 查询客户财务
     * 
     * @param id 客户财务ID
     * @return 客户财务
     */
    public ClientFinace selectClientFinaceById(Long id);

    /**
     * 查询客户财务列表
     * 
     * @param clientFinace 客户财务
     * @return 客户财务集合
     */
    public List<ClientFinace> selectClientFinaceList(ClientFinace clientFinace);

    /**
     * 查询客户财务单条
     *
     * @param clientFinace
     * @return
     */
    public List<ClientFinace> selectClientFinaceData(ClientFinace clientFinace);

    /**
     * 新增客户财务
     * 
     * @param clientFinace 客户财务
     * @return 结果
     */
    public int insertClientFinace(ClientFinace clientFinace);

    /**
     * 修改客户财务
     * 
     * @param clientFinace 客户财务
     * @return 结果
     */
    public int updateClientFinace(ClientFinace clientFinace);

    /**
     * 删除客户财务
     * 
     * @param id 客户财务ID
     * @return 结果
     */
    public int deleteClientFinaceById(Long id);

    /**
     * 批量删除客户财务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientFinaceByIds(String[] ids);
}
