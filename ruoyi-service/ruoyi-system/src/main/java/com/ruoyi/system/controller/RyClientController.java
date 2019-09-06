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

/**
 * 客户 提供者
 *
 * @author ruoyi
 * @date 2019-09-04
 */
@RestController
@RequestMapping("ryClient" )
public class RyClientController extends BaseController {

    @Autowired
    private IRyClientService RyClientService;

    /**
     * 查询${tableComment}
     *
     * @return
     */
    @GetMapping("get/{id}" )
    public RyClient get(@PathVariable("id" ) Long id) {
        return RyClientService.selectRyClientById(id);
    }

    /**
     * 查询客户列表
     */
    @HasPermissions("system:client:list" )
    @GetMapping("list" )
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
    @PostMapping("fileList" )
    public R fileList(Long id) {
        return result(RyClientService.selectClientFileList(id));
    }

    /**
     * 新增保存客户
     */
    @PostMapping("save" )
    public R addSave(@RequestBody RyClient ryClient) {
        System.out.println(ryClient.toString());
        return toAjax(RyClientService.insertRyClient(ryClient));
    }

    /**
     * 修改保存客户
     */
    @HasPermissions("system:client:edit" )
    @PostMapping("update" )
    @OperLog(title = "客户管理", businessType = BusinessType.UPDATE)
    public R editSave(@RequestBody RyClient ryClient) {
        return toAjax(RyClientService.updateRyClient(ryClient));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("remove" )
    @OperLog(title = "客户管理", businessType = BusinessType.DELETE)
    public R remove(String ids) {
        return toAjax(RyClientService.deleteRyClientByIds(ids));
    }
}
