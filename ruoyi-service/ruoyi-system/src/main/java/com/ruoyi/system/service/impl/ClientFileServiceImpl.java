package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientFileMapper;
import com.ruoyi.system.domain.ClientFile;
import com.ruoyi.system.service.IClientFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户文件Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-06
 */
@Service
public class ClientFileServiceImpl implements IClientFileService 
{
    @Autowired
    private ClientFileMapper clientFileMapper;

    /**
     * 查询客户文件
     * 
     * @param id 客户文件ID
     * @return 客户文件
     */
    @Override
    public ClientFile selectClientFileById(Long id)
    {
        return clientFileMapper.selectClientFileById(id);
    }

    /**
     * 查询客户文件列表
     * 
     * @param clientFile 客户文件
     * @return 客户文件
     */
    @Override
    public List<ClientFile> selectClientFileList(ClientFile clientFile)
    {
        return clientFileMapper.selectClientFileList(clientFile);
    }

    /**
     * 新增客户文件
     * 
     * @param clientFile 客户文件
     * @return 结果
     */
    @Override
    public int insertClientFile(ClientFile clientFile)
    {
        clientFile.setCreateTime(DateUtils.getNowDate());
        return clientFileMapper.insertClientFile(clientFile);
    }

    /**
     * 修改客户文件
     * 
     * @param clientFile 客户文件
     * @return 结果
     */
    @Override
    public int updateClientFile(ClientFile clientFile)
    {
        clientFile.setUpdateTime(DateUtils.getNowDate());
        return clientFileMapper.updateClientFile(clientFile);
    }

    /**
     * 删除客户文件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientFileByIds(String ids)
    {
        return clientFileMapper.deleteClientFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户文件信息
     * 
     * @param id 客户文件ID
     * @return 结果
     */
    public int deleteClientFileById(Long id)
    {
        return clientFileMapper.deleteClientFileById(id);
    }
}
