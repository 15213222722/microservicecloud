package com.hhf.springcloud.provider.dept.service;

import java.util.List;
import com.hhf.springcloud.common.Dept;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept  get(Long id);
    public List<Dept> list();
}