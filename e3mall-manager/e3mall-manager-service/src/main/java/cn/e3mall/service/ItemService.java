
package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;

public interface ItemService {

	//根据id查询Item商品 返回json数据
	
	public TbItem findByItemId(Long id);
	
}
