package com.dj.service;

import java.sql.SQLException;
import java.util.List;

import com.dj.dao.ProductDao;
import com.dj.domain.Product;

public class ProductService {


	public List<Product> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return new ProductDao().findAll();
	}

}
