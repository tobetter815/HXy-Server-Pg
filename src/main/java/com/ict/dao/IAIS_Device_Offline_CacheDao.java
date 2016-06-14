package com.ict.dao;

import com.ict.model.AIS_Device_Offline_Cache;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenlong on 5/3/2016.
 */
@Repository
public interface IAIS_Device_Offline_CacheDao {
    public List<AIS_Device_Offline_Cache> getAIS_Device_Offline_Cache(@Param("insertTime") Double insertTime, @Param("num") Long num);

    Integer getCount(@Param("insertTime") Integer insertTime);
}
