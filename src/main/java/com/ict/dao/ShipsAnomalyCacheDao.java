package com.ict.dao;

import com.ict.model.ShipsAnomalyCache;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipsAnomalyCacheDao {

    List<ShipsAnomalyCache> getShipsAnomalyCache(@Param("insertTime") Double insertTime, @Param("num") Long num);

    Integer getCount(@Param("insertTime") Integer insertTime);
}