package com.liangjunwei.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.liangjunwei.domain.Hua;
import com.liangjunwei.service.HuaService;
import com.liangjunwei.utils.PageUtil;

@Controller
public class HuaController {
  @Resource
  private HuaService huaService;
  
  /***
   * 
      * @Title: list
      * @Description: 全查
      * @param @param request
      * @param @param name
      * @param @param pageNum
      * @param @param pageSize
      * @param @return    参数
      * @return String    返回类型
      * @throws
   */
  @RequestMapping("selects")
  public String list(HttpServletRequest request ,
		  @RequestParam(defaultValue="")String name,
		  @RequestParam(defaultValue="1")Integer pageNum,
		  @RequestParam(defaultValue="3")Integer pageSize){
	   
	   PageInfo<Hua> info = huaService.selects(name, pageNum, pageSize);
	   PageUtil.pageNum(request, "selects", pageSize, info.getList(), (int) info.getTotal(), pageNum);
	   request.setAttribute("selects",info.getList());
	   request.setAttribute("name",name);
		return "list";
	  
  }
  /***
   * 
      * @Title: listId
      * @Description: 查询
      * @param @param id
      * @param @param request
      * @param @return    参数
      * @return String    返回类型
      * @throws
   */
  @RequestMapping("cha")
  public String listId(Integer id,HttpServletRequest request){
	  List selectsId = huaService.selectsId(id);
	  request.setAttribute("list",selectsId);
	  return "cha";
  }
  /**
   * 
      * @Title: del
      * @Description: T删除
      * @param @param id
      * @param @return    参数
      * @return boolean    返回类型
      * @throws
   */
  @RequestMapping("del")
  @ResponseBody
  public boolean del(String id){
	  try {
		huaService.del(id);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	  
  }
  /***
   * 
      * @Title: add
      * @Description: qu1增加
      * @param @return    参数
      * @return String    返回类型
      * @throws
   */
  @RequestMapping("add")
  public String add(){
	  return "add";
  }
  /***
   * 
      * @Title: add1
      * @Description: 增加2
      * @param @param hua
      * @param @return    参数
      * @return boolean    返回类型
      * @throws
   */
  @ResponseBody
  @RequestMapping("add1")
  public boolean add1(Hua hua){
	  try {
		huaService.add1(hua);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
  }
  
}
