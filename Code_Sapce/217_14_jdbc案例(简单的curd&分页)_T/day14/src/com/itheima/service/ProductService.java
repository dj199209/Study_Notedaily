package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.ProductDao;
import com.itheima.domain.PageBean;
import com.itheima.domain.Product;

public class ProductService {

	/**
	 * 查询所有商品
	 * @return list
	 * @throws SQLException 
	 */
	public List<Product> findAll() throws SQLException {
		return new ProductDao().findAll();
	}

	/**
	 * 添加商品
	 * @param p
	 * @throws SQLException 
	 */
	public void addProuct(Product p) throws SQLException {
		new ProductDao().addProduct(p);
	}

	/**
	 * 通过id查找商品
	 * @param pid 商品id
	 * @return 商品
	 * @throws SQLException 
	 */
	public Product getProductById(String pid) throws SQLException {
		return new ProductDao().getProductById(pid);
	}

	/**
	 * 修改商品
	 * @param p 商品信息
	 * @throws SQLException 
	 */
	public void updateProduct(Product p) throws SQLException {
		new ProductDao().updateProductById(p);
	}

	/**
	 * 通过pid删除商品
	 * @param pid 商品id
	 * @throws SQLException 
	 */
	public void deleteProductById(String pid) throws SQLException {
		new ProductDao().deleteProductById(pid);
	}

	/**
	 * 删除多个商品
	 * @param ids
	 * @throws SQLException 
	 */
	public void deleteManyProdcut(String[] ids) throws SQLException {
		ProductDao pDao = new ProductDao();
		for (String pid:ids) {
			pDao.deleteProductById(pid);
		}
	}

	/**
	 * 多条件查询
	 * @param name 商品名称
	 * @param kw 关键词
	 * @return list
	 * @throws SQLException 
	 */
	public List<Product> findProductByCondition(String name, String kw) throws SQLException {
		return new ProductDao().findProductByCondition(name,kw);
	}

	/**
	 * 分页查询商品
	 * @param currPage 第几页
	 * @param pageSize 每页显示的条数
	 * @return pagebean
	 * @throws SQLException 
	 */
	public PageBean<Product> showProductsByPage(int currPage, int pageSize) throws SQLException {
		//查询当前页数据 limit (当前页-1)*每页显示条数,每页显示条数;
		ProductDao dao=new ProductDao();
		List<Product> list=dao.findProductByPage(currPage,pageSize);
		
		//查询总条数
		int totalCount=dao.getCount();
		
		return new PageBean<>(list, currPage, pageSize, totalCount);
	}

}
