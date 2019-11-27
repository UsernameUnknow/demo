package com.dao;

import com.entity.DeptEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    List<DeptEntity> getAll(@Param("pageNum")int page, @Param("pageSize")int pageSize);
}
