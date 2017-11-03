package com.salary.service;

import java.util.List;

import com.salary.pojo.Admin;

public interface AdminService {
	/**
	 * 查询
	 * */
	List<Admin> selectByExample();
	Admin selectByPrimaryKey();
	/**
	 * 增加
	 * */
	int insert();
	int insertSelective();
	/**
	 * 删除
	 * */
	int deleteByExample();
	int deleteByPrimaryKey();
	/**
	 * 修改
	 * */
	int updateByPrimaryKeySelective();
	int updateByPrimaryKey();
	
}
