package com.service;

import com.entity.DeptEntity;

import java.util.List;

public interface DeptService {

    List<DeptEntity> getAll(int pageNum, int pageSize);

}

