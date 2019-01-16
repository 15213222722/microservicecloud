package com.hhf.springcloud.provider.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhf.springcloud.common.Dept;
import com.hhf.springcloud.provider.dept.dao.DeptDao;
import com.hhf.springcloud.provider.dept.service.DeptService;

@Service
public class DeptServiceimpl implements DeptService {
    @Autowired
    private DeptDao dao;
 
    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }
 
    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }
 
    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
 
}