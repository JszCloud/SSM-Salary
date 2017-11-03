package com.salary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salary.mapper.AdminMapper;
import com.salary.pojo.Admin;
import com.salary.pojo.AdminExample;
import com.salary.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;
	
	/**
	 * 根据条件查询
	 * */
	@Override
	public List<Admin> selectByExample() {
		AdminExample admin=new AdminExample();
		return adminMapper.selectByExample(admin);
	}

	/**
	 * 根据主键查询
	 * */
	@Override
	public Admin selectByPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 插入所有的字段
	 * */
	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 插入对象不为空的字段
	 * */
	@Override
	public int insertSelective() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据条件删除
	 * */
	@Override
	public int deleteByExample() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据主键删除
	 * */
	@Override
	public int deleteByPrimaryKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据条件修改
	 * */
	@Override
	public int updateByPrimaryKeySelective() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据主键修改
	 * */
	@Override
	public int updateByPrimaryKey() {
		// TODO Auto-generated method stub
		return 0;
	}

}
