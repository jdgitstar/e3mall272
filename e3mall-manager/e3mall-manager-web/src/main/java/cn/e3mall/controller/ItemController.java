package cn.e3mall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {

	@Resource
	private ItemService itemService;

	@RequestMapping("/findTbItemById/{itemId}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long itemId) {

		TbItem item = itemService.findByItemId(itemId);

		return item;

	}

}
