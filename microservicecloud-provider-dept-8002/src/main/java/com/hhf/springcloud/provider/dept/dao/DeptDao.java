package com.hhf.springcloud.provider.dept.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hhf.springcloud.common.Dept;

//整合mybatis
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();
}