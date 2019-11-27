package com.service.impl;

import com.dao.DeptDao;
import com.entity.DeptEntity;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public List<DeptEntity> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum, pageSize);
    }
}
