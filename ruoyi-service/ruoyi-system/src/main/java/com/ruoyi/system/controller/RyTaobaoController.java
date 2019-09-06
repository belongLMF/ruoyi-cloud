package com.ruoyi.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.RyTaobao;
import com.ruoyi.system.service.IRyTaobaoService;

/**
 * 淘宝认证 提供者
 *
 * @author ruoyi
 * @date 2019-09-06
 */
@RestController
@RequestMapping("taobao")
public class RyTaobaoController extends BaseController
{

	@Autowired
	private IRyTaobaoService ryTaobaoService;

	/**
	 * 查询${tableComment}
	 */
	@GetMapping("get/{id}")
	public RyTaobao get(@PathVariable("id") Long id)
	{
		return ryTaobaoService.selectRyTaobaoById(id);

	}

	/**
	 * 查询淘宝认证列表
	 */
	@GetMapping("list")
	public R list(RyTaobao ryTaobao)
	{
		startPage();
		return result(ryTaobaoService.selectRyTaobaoList(ryTaobao));
	}


	/**
	 * 新增保存淘宝认证
	 */
	@PostMapping("save")
	public R addSave(@RequestBody RyTaobao ryTaobao)
	{
		return toAjax(ryTaobaoService.insertRyTaobao(ryTaobao));
	}

	/**
	 * 修改保存淘宝认证
	 */
	@PostMapping("update")
	public R editSave(@RequestBody RyTaobao ryTaobao)
	{
		return toAjax(ryTaobaoService.updateRyTaobao(ryTaobao));
	}

	/**
	 * 删除${tableComment}
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{
		return toAjax(ryTaobaoService.deleteRyTaobaoByIds(ids));
	}

}
