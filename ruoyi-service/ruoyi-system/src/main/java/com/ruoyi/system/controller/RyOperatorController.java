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
import com.ruoyi.system.domain.RyOperator;
import com.ruoyi.system.service.IRyOperatorService;

/**
 * 运营商认证 提供者
 *
 * @author ruoyi
 * @date 2019-09-06
 */
@RestController
@RequestMapping("operator")
public class RyOperatorController extends BaseController
{

	@Autowired
	private IRyOperatorService ryOperatorService;

	/**
	 * 查询${tableComment}
	 */
	@GetMapping("get/{id}")
	public RyOperator get(@PathVariable("id") Long id)
	{
		return ryOperatorService.selectRyOperatorById(id);

	}

	/**
	 * 查询运营商认证列表
	 */
	@GetMapping("list")
	public R list(RyOperator ryOperator)
	{
		startPage();
		return result(ryOperatorService.selectRyOperatorList(ryOperator));
	}


	/**
	 * 新增保存运营商认证
	 */
	@PostMapping("save")
	public R addSave(@RequestBody RyOperator ryOperator)
	{
		return toAjax(ryOperatorService.insertRyOperator(ryOperator));
	}

	/**
	 * 修改保存运营商认证
	 */
	@PostMapping("update")
	public R editSave(@RequestBody RyOperator ryOperator)
	{
		return toAjax(ryOperatorService.updateRyOperator(ryOperator));
	}

	/**
	 * 删除${tableComment}
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{
		return toAjax(ryOperatorService.deleteRyOperatorByIds(ids));
	}

}
