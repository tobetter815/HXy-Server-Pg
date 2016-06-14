package com.ict.dao;

import com.ict.model.GridsAnomalyCache;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GridsAnomalyCacheDao {

    List<GridsAnomalyCache> getGridsAnomalyCache(@Param("insertTime") Double insertTime, @Param("num") Long num);

    Integer getCount(@Param("insertTime") Integer insertTime);
}