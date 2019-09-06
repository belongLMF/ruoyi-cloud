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
import com.ruoyi.system.domain.RyMoxie;
import com.ruoyi.system.service.IRyMoxieService;

/**
 * 魔蝎认证 提供者
 *
 * @author ruoyi
 * @date 2019-09-06
 */
@RestController
@RequestMapping("moxie")
public class RyMoxieController extends BaseController
{

	@Autowired
	private IRyMoxieService ryMoxieService;

	/**
	 * 查询${tableComment}
	 */
	@GetMapping("get/{id}")
	public RyMoxie get(@PathVariable("id") Long id)
	{
		return ryMoxieService.selectRyMoxieById(id);

	}

	/**
	 * 查询魔蝎认证列表
	 */
	@GetMapping("list")
	public R list(RyMoxie ryMoxie)
	{
		startPage();
		return result(ryMoxieService.selectRyMoxieList(ryMoxie));
	}


	/**
	 * 新增保存魔蝎认证
	 */
	@PostMapping("save")
	public R addSave(@RequestBody RyMoxie ryMoxie)
	{
		return toAjax(ryMoxieService.insertRyMoxie(ryMoxie));
	}

	/**
	 * 修改保存魔蝎认证
	 */
	@PostMapping("update")
	public R editSave(@RequestBody RyMoxie ryMoxie)
	{
		return toAjax(ryMoxieService.updateRyMoxie(ryMoxie));
	}

	/**
	 * 删除${tableComment}
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{
		return toAjax(ryMoxieService.deleteRyMoxieByIds(ids));
	}

}
