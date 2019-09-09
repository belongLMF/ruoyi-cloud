package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientBankCardMapper;
import com.ruoyi.system.domain.ClientBankCard;
import com.ruoyi.system.service.IClientBankCardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户银行卡Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
@Service
public class ClientBankCardServiceImpl implements IClientBankCardService 
{
    @Autowired
    private ClientBankCardMapper clientBankCardMapper;

    /**
     * 查询客户银行卡
     * 
     * @param id 客户银行卡ID
     * @return 客户银行卡
     */
    @Override
    public ClientBankCard selectClientBankCardById(Long id)
    {
        return clientBankCardMapper.selectClientBankCardById(id);
    }

    /**
     * 查询客户银行卡列表
     * 
     * @param clientBankCard 客户银行卡
     * @return 客户银行卡
     */
    @Override
    public List<ClientBankCard> selectClientBankCardList(ClientBankCard clientBankCard)
    {
        return clientBankCardMapper.selectClientBankCardList(clientBankCard);
    }

    /**
     * 查询客户银行卡
     * @param clientBankCard
     * @return
     */
    @Override
    public List<ClientBankCard> selectClientBankCardData(ClientBankCard clientBankCard)
    {
        return clientBankCardMapper.selectClientBankCardData(clientBankCard);
    }

    /**
     * 新增客户银行卡
     * 
     * @param clientBankCard 客户银行卡
     * @return 结果
     */
    @Override
    public int insertClientBankCard(ClientBankCard clientBankCard)
    {
        clientBankCard.setCreateTime(DateUtils.getNowDate());
        return clientBankCardMapper.insertClientBankCard(clientBankCard);
    }

    /**
     * 修改客户银行卡
     * 
     * @param clientBankCard 客户银行卡
     * @return 结果
     */
    @Override
    public int updateClientBankCard(ClientBankCard clientBankCard)
    {
        clientBankCard.setUpdateTime(DateUtils.getNowDate());
        return clientBankCardMapper.updateClientBankCard(clientBankCard);
    }

    /**
     * 删除客户银行卡对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientBankCardByIds(String ids)
    {
        return clientBankCardMapper.deleteClientBankCardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户银行卡信息
     * 
     * @param id 客户银行卡ID
     * @return 结果
     */
    public int deleteClientBankCardById(Long id)
    {
        return clientBankCardMapper.deleteClientBankCardById(id);
    }
}
