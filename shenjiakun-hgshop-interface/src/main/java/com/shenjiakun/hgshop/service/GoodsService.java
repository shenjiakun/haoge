package com.shenjiakun.hgshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shenjiakun.hgshop.pojo.Brand;
import com.shenjiakun.hgshop.pojo.Category;

/*
 * Dubbo 服务接口函数不能是void的返回值
 */
public interface GoodsService {

	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	/**
	 * 
	 * @Title: listBrand 
	 * @Description: TODO
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 * @return: PageInfo<Brand>
	 */
	PageInfo<Brand> listBrand(String firstChar,int page);
	
	
	
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Category> listCategory( String firstChar,int page); 

	/**
	 * 以树的形式显示列表
	 */
	List<Category> treeCategory();
}
