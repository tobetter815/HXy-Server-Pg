package com.ict.service;

import com.ict.dao.*;
import com.ict.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by weiaquarius on 16/4/20.
 */
@Service
public class CacheService {
    @Autowired
    public GridsAnomalyCacheDao gridsAnomalyCacheDao;
    @Autowired
    public InboundOutboundCacheDao inboundOutboundCacheDao;
    @Autowired
    public ShipsAnomalyCacheDao shipsAnomalyCacheDao;
    @Autowired
    public IShip_Rendezvous_CacheDao iShip_rendezvous_cacheDao;
    @Autowired
    public IAIS_Device_Offline_CacheDao iais_device_offline_cacheDao;

    public List<GridsAnomalyCache> getGridsAnomlyCache(Double insertTime, Long num) {
        try{
            return gridsAnomalyCacheDao.getGridsAnomalyCache(insertTime,num);
        }catch (Exception e){
            System.out.print("数据操作异常："+e);
            return null;
        }
    }

    public List<InboundOutboundCache> getInboundOutboundCache(Double insertTime, Long num) {
        try {
            return inboundOutboundCacheDao.getInboundOutboundCache(insertTime, num);
        }catch (Exception e){
            System.out.print("数据操作异常："+e);
            return null;
        }
    }

    public List<ShipsAnomalyCache> getShipsAnomlyCache(Double insertTime, Long num){
        try {
            return shipsAnomalyCacheDao.getShipsAnomalyCache(insertTime, num);
        }catch (Exception e){
            System.out.print("数据操作异常："+e);
            return null;
        }
    }

    public List<Ship_Rendezvous_Cache> getShip_Rendezvous_Cache(Double insertTime, Long num){
        try {
            return iShip_rendezvous_cacheDao.getShip_Rendezvous_Cache(insertTime, num);
        }catch (Exception e){
            System.out.print("数据操作异常："+e);
            return null;
        }
    }

    public List<AIS_Device_Offline_Cache> getAIS_Device_Offline_Cache(Double insertTime, Long num){
        try {
            return iais_device_offline_cacheDao.getAIS_Device_Offline_Cache(insertTime, num);
        }catch (Exception e){
            System.out.print("数据操作异常："+e);
            return null;
        }
    }

    public int getGridsAnomlyCacheCount(Integer insertTime){
        try {
            return gridsAnomalyCacheDao.getCount(insertTime);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public int getInboundOutboundCacheCount(Integer insertTime){
        try {
            return inboundOutboundCacheDao.getCount(insertTime);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    public int getShipsAnomlyCacheCount(Integer insertTime){
        try {
            return shipsAnomalyCacheDao.getCount(insertTime);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    public int getShip_Rendezvous_CacheCount(Integer insertTime){
        try {
            return iShip_rendezvous_cacheDao.getCount(insertTime);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    public int getAIS_Device_Offline_CacheCount(Integer insertTime){
        try {
            return iais_device_offline_cacheDao.getCount(insertTime);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
