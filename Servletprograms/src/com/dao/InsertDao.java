package com.dao;

import java.util.List;

import com.pojo.Userbean;

public interface InsertDao {
	public void insertValues(Userbean userbean);
	public List<Userbean> getValues();
}

