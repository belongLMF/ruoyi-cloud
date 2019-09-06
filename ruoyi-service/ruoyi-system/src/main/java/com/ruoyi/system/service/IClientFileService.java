package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientFile;
import java.util.List;

/**
 * 客户文件Service接口
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
public interface IClientFileService 
{
    /**
     * 查询客户文件
     * 
     * @param id 客户文件ID
     * @return 客户文件
     */
    public ClientFile selectClientFileById(Long id);

    /**
     * 查询客户文件列表
     * 
     * @param clientFile 客户文件
     * @return 客户文件集合
     */
    public List<ClientFile> selectClientFileList(ClientFile clientFile);

    /**
     * 新增客户文件
     * 
     * @param clientFile 客户文件
     * @return 结果
     */
    public int insertClientFile(ClientFile clientFile);

    /**
     * 修改客户文件
     * 
     * @param clientFile 客户文件
     * @return 结果
     */
    public int updateClientFile(ClientFile clientFile);

    /**
     * 批量删除客户文件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientFileByIds(String ids);

    /**
     * 删除客户文件信息
     * 
     * @param id 客户文件ID
     * @return 结果
     */
    public int deleteClientFileById(Long id);
}
