package com.liangjunwei.dao;

import java.util.List;


import com.liangjunwei.domain.Hua;

public interface HuaMapper {
	//全查  
   public List<Hua> selects(String name);
   
   //根据查看
	List selectsId(Integer id);
	//删除
	void del(String id);
	//增加
	void add1(Hua hua);
}
