package com.dj.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dj.domain.Product;
import com.dj.utils.DataSourceUtils;

public class ProductDao {

	public List<Product> findAll() throws SQLException {
		//创建queryrunner
				QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
				//编写sql
				String sql = "select *from product";
				//执行sql
				return qr.query(sql, new BeanListHandler<>(Product.class));
	}

}
