package com.ruoyi.system.controller;

import com.ruoyi.common.auth.annotation.HasPermissions;
import com.ruoyi.common.log.annotation.OperLog;
import com.ruoyi.common.log.enums.BusinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.RyClient;
import com.ruoyi.system.service.IRyClientService;
import com.ruoyi.system.domain.ClientBankCard;
import com.ruoyi.system.service.IClientBankCardService;
import com.ruoyi.system.domain.ClientMailList;
import com.ruoyi.system.service.IClientMailListService;
import com.ruoyi.system.domain.ClientFinace;
import com.ruoyi.system.service.IClientFinaceService;
import com.ruoyi.system.domain.ClientInfo;
import com.ruoyi.system.service.IClientInfoService;
import com.ruoyi.system.domain.ClientJobInfo;
import com.ruoyi.system.service.IClientJobInfoService;

/**
 * 客户 提供者
 *
 * @author ruoyi
 * @date 2019-09-04
 */
@RestController
@RequestMapping("ryClient")
public class RyClientController extends BaseController {

    @Autowired
    private IRyClientService RyClientService;

    @Autowired
    private IClientBankCardService ClientBankCardService;

    @Autowired
    private IClientMailListService ClientMailListService;

    @Autowired
    private IClientFinaceService ClientFinaceService;

    @Autowired
    private IClientInfoService ClientInfoService;

    @Autowired
    private IClientJobInfoService ClientJobInfoService;

    /**
     * 查询${tableComment}
     *
     * @return
     */
    @GetMapping("get/{id}")
    public RyClient get(@PathVariable("id") Long id) {
        return RyClientService.selectRyClientById(id);
    }

    /**
     * 查询客户列表
     */
    @HasPermissions("system:client:list")
    @GetMapping("list")
    public R list(RyClient ryClient) {
        startPage();
        return result(RyClientService.selectRyClientList(ryClient));
    }

    /**
     * 查询客户的影像资料
     *
     * @param id
     * @return
     */
    @PostMapping("fileList")
    public R fileList(Long id) {
        return result(RyClientService.selectClientFileList(id));
    }

    /**
     * 新增保存客户
     */
    @PostMapping("save")
    public R addSave(@RequestBody RyClient ryClient) {
        System.out.println(ryClient.toString());
        return toAjax(RyClientService.insertRyClient(ryClient));
    }

    /**
     * 修改保存客户
     */
    @HasPermissions("system:client:edit")
    @PostMapping("update")
    @OperLog(title = "客户管理", businessType = BusinessType.UPDATE)
    public R editSave(@RequestBody RyClient ryClient) {
        return toAjax(RyClientService.updateRyClient(ryClient));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("remove")
    @OperLog(title = "客户管理", businessType = BusinessType.DELETE)
    public R remove(String ids) {
        return toAjax(RyClientService.deleteRyClientByIds(ids));
    }

    /******************(银行卡相关)********/
    /**
     * 查询客户银行卡列表
     */
    @GetMapping("bankList")
    public R bankList(ClientBankCard clientBankCard) {
        startPage();
        return result(ClientBankCardService.selectClientBankCardList(clientBankCard));
    }

    /**
     * 新增保存客户银行卡
     */
    @PostMapping("bankAddSave")
    public R bankAddSave(@RequestBody ClientBankCard clientBankCard) {
        return toAjax(ClientBankCardService.insertClientBankCard(clientBankCard));
    }

    /**
     * 修改保存客户银行卡
     */
    @PostMapping("bankEditSave")
    public R bankEditSave(@RequestBody ClientBankCard clientBankCard) {
        return toAjax(ClientBankCardService.updateClientBankCard(clientBankCard));
    }

    /****************通讯录**************/
    /**
     * 查询客户通讯录列表
     */
    @GetMapping("mailList")
    public R mailList(ClientMailList clientMailList) {
        startPage();
        return result(ClientMailListService.selectClientMailListList(clientMailList));
    }

    /**
     * 新增保存客户通讯录
     */
    @PostMapping("mailAddSave")
    public R mailAddSave(@RequestBody ClientMailList clientMailList) {
        return toAjax(ClientMailListService.insertClientMailList(clientMailList));
    }

    /**
     * 修改保存客户通讯录
     */
    @PostMapping("mailEditSave")
    public R mailEditSave(@RequestBody ClientMailList clientMailList) {
        return toAjax(ClientMailListService.updateClientMailList(clientMailList));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("mailRemove")
    public R mailRemove(String ids) {
        return toAjax(ClientMailListService.deleteClientMailListByIds(ids));
    }

    /*****************财务***********/
    /**
     * 查询客户财务列表
     */
    @GetMapping("finaceList")
    public R finaceList(ClientFinace clientFinace) {
        startPage();
        return result(ClientFinaceService.selectClientFinaceList(clientFinace));
    }

    /**
     * 查询客户财务单条
     * @param clientFinace
     * @return
     */
    @GetMapping("getFinaceData")
    public R getFinaceData(ClientFinace clientFinace)
    {
        startPage();
        return result(ClientFinaceService.selectClientFinaceData(clientFinace));
    }


    /**
     * 新增保存客户财务
     */
    @PostMapping("finaceAddSave")
    public R finaceAddSave(@RequestBody ClientFinace clientFinace) {
        return toAjax(ClientFinaceService.insertClientFinace(clientFinace));
    }

    /**
     * 修改保存客户财务
     */
    @PostMapping("finaceEditSave")
    public R finaceEditSave(@RequestBody ClientFinace clientFinace) {
        return toAjax(ClientFinaceService.updateClientFinace(clientFinace));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("finaceRemove")
    public R finaceRemove(String ids) {
        return toAjax(ClientFinaceService.deleteClientFinaceByIds(ids));
    }

    /********** 客户基本信息 **********/
    /**
     * 查询客户基本信息+紧急联系人
     */
    @PostMapping("getInfo")
    public ClientInfo getInfo(ClientInfo clientInfo) {
        Long cid = clientInfo.getCid();
        return ClientInfoService.selectClientInfoById(cid);
    }

    /**
     * 新增保存客户基本信息+紧急联系人
     */
    @PostMapping("infoAddSave")
    public R infoAddSave(@RequestBody ClientInfo clientInfo) {
        return toAjax(ClientInfoService.insertClientInfo(clientInfo));
    }

    /********* 客户工作信息 *********/
    /**
     * 查询客户工作信息
     */
    @PostMapping("getJobInfo")
    public ClientJobInfo getJobInfo(ClientJobInfo clientJobInfo) {
        Long cid = clientJobInfo.getCid();
        return ClientJobInfoService.selectClientJobInfoById(cid);
    }

    /**
     * 新增保存客户工作信息
     */
    @PostMapping("jobInfoAddSave")
    public R jobInfoAddSave(@RequestBody ClientJobInfo clientJobInfo) {
        return toAjax(ClientJobInfoService.insertClientJobInfo(clientJobInfo));
    }
}
