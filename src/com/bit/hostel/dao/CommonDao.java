package com.bit.hostel.dao;

import java.sql.Connection;
import java.util.List;

import com.bit.hostel.common.DBUtils;

public abstract class CommonDao<T> {
	public Connection getConnection(){
		return DBUtils.getConnection();
		
	}
	public abstract List<T> get();
	public abstract T get(int id);
	public abstract void saveOrUpdate(T obj);
	public abstract int delete(int id);
	public abstract int delete(T obj);
}
