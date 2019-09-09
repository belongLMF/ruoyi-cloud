package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.ClientBankCard;
import java.util.List;

/**
 * 客户银行卡Mapper接口
 * 
 * @author ruoyi
 * @date 2019-09-09
 */
public interface ClientBankCardMapper 
{
    /**
     * 查询客户银行卡
     * 
     * @param id 客户银行卡ID
     * @return 客户银行卡
     */
    public ClientBankCard selectClientBankCardById(Long id);

    /**
     * 查询客户银行卡列表
     * 
     * @param clientBankCard 客户银行卡
     * @return 客户银行卡集合
     */
    public List<ClientBankCard> selectClientBankCardList(ClientBankCard clientBankCard);

    /**
     * 新增客户银行卡
     * 
     * @param clientBankCard 客户银行卡
     * @return 结果
     */
    public int insertClientBankCard(ClientBankCard clientBankCard);

    /**
     * 修改客户银行卡
     * 
     * @param clientBankCard 客户银行卡
     * @return 结果
     */
    public int updateClientBankCard(ClientBankCard clientBankCard);

    /**
     * 删除客户银行卡
     * 
     * @param id 客户银行卡ID
     * @return 结果
     */
    public int deleteClientBankCardById(Long id);

    /**
     * 批量删除客户银行卡
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientBankCardByIds(String[] ids);
}
