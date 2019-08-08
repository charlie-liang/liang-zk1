package com.liangjunwei.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liangjunwei.domain.Hua;

public interface HuaService {
	/***
	 *  
	    * @Title: selects
	    * @Description: 全查
	    * @param @param name
	    * @param @param pageNum
	    * @param @param pageSize
	    * @param @return    参数
	    * @return PageInfo<Hua>    返回类型
	    * @throws
	 */
	

	PageInfo<Hua> selects(String name, Integer pageNum, Integer pageSize);
   /***
    * 
       * @Title: selectsId
       * @Description:根基id查案
       * @param @param id
       * @param @return    参数
       * @return List    返回类型
       * @throws
    */
	List selectsId(Integer id);
	/***
	 * 
	    * @Title: del
	    * @Description: 删除
	    * @param @param id    参数
	    * @return void    返回类型
	    * @throws
	 */
	void del(String id);
	/***
	 * 
	    * @Title: add1
	    * @Description增加
	    * @param @param hua    参数
	    * @return void    返回类型
	    * @throws
	 */
	void add1(Hua hua);
}
