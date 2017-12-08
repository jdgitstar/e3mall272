package cn.e3mall.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	// 注入dao
	@Resource
	private TbItemMapper itemMapper;

	public TbItem findByItemId(Long id) {
		// TODO Auto-generated method stub
		TbItem item = itemMapper.selectByPrimaryKey(id);
		return item;
	}

}
