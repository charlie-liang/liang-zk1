package com.liangjunwei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangjunwei.dao.HuaMapper;
import com.liangjunwei.domain.Hua;
import com.liangjunwei.service.HuaService;
@Service
public class HuaServiceImpl implements HuaService {
    @Resource
    private HuaMapper  huaMapper;
    /**
     * 查询
     */
	@Override
	public PageInfo<Hua> selects(String name,Integer pageNum,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		 List<Hua> list = huaMapper.selects(name);
		PageInfo<Hua> info = new PageInfo<>(list);
		return info;
	}
	/***
	 * 根据id查
	 */
	@Override
	public List selectsId(Integer id) {
		// TODO Auto-generated method stub
		return huaMapper.selectsId(id);
	}
	/**
	 * 删除
	 */
	@Override
	public void del(String id) {
		// TODO Auto-generated method stub
		huaMapper.del(id);
	}
	/***
	 * 增加
	 */
	@Override
	public void add1(Hua hua) {
		// TODO Auto-generated method stub
		huaMapper.add1(hua);
	}

}
