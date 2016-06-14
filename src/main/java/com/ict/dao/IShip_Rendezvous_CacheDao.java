package com.ict.dao;

import com.ict.model.Ship_Rendezvous_Cache;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenlong on 5/3/2016.
 */
@Repository
public interface IShip_Rendezvous_CacheDao {
    public List<Ship_Rendezvous_Cache> getShip_Rendezvous_Cache(@Param("insertTime") Double insertTime, @Param("num") Long num);

    Integer getCount(@Param("insertTime") Integer insertTime);
}
