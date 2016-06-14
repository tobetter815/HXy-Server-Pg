package com.ict.controller;

import com.ict.common.StateMsg;
import com.ict.model.*;
import com.ict.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by weiaquarius on 16/4/20.
 */

@Controller
@RequestMapping("/summary")
public class getCacheController {
    @Autowired
    public CacheService cacheService;

    /**
     *4.1 进出港实时提醒
     * URL:http://localhost:8080/alert/summary/getCache.do?insertTime=0&packageType=3&num=4
     * @param map
     * @param insertTime 查询最新信息 值为0；或查询 insertTime之前数据
     * @param packageType 1:Grids_Anomaly_Cache; 2:Inbound_Outbound_Cache; 3:Ships_Anomaly_Cache;
     *                    4:AIS_Device_Offline_Cache;5:Ship_Rendezvous_Cache
     * @param num 返回记录的数量
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "getCache.do",method = RequestMethod.GET)
    public String getCache(ModelMap map, @RequestParam Double insertTime, @RequestParam Short packageType, @RequestParam Long num) {
        String msg;
        String jsonStr;

        if (packageType == 1){
            List<GridsAnomalyCache> list = cacheService.getGridsAnomlyCache(insertTime,num);
            if(list==null){
                msg="Failure";
                map.addAttribute("msg",msg);
                jsonStr = StateMsg.toJson(-1, map);
                return jsonStr;
            }
            map.addAttribute("list",list);
        }
        else if (packageType == 2){
            List<InboundOutboundCache> list = cacheService.getInboundOutboundCache(insertTime,num);
            if(list==null){
                msg="Failure";
                map.addAttribute("msg",msg);
                jsonStr = StateMsg.toJson(-1, map);
                return jsonStr;
            }
            map.addAttribute("list",list);
        }
        else if (packageType == 3){
            List<ShipsAnomalyCache> list = cacheService.getShipsAnomlyCache(insertTime,num);
            if(list==null){
                msg="Failure";
                map.addAttribute("msg",msg);
                jsonStr = StateMsg.toJson(-1, map);
                return jsonStr;
            }
            map.addAttribute("list",list);
        }

        else if(packageType ==4){
            List<AIS_Device_Offline_Cache> list=cacheService.getAIS_Device_Offline_Cache(insertTime,num);
            if(list==null){
                msg="Failure";
                map.addAttribute("msg",msg);
                jsonStr = StateMsg.toJson(-1, map);
                return jsonStr;
            }
            map.addAttribute("list",list);
        }

        else if(packageType ==5){
            List<Ship_Rendezvous_Cache> list=cacheService.getShip_Rendezvous_Cache(insertTime,num);
            if(list==null){
                msg="Failure";
                map.addAttribute("msg",msg);
                jsonStr = StateMsg.toJson(-1, map);
                return jsonStr;
            }
            map.addAttribute("list",list);
        }else{
            msg="输入packageType错误，packageType取值1~5";
            map.addAttribute("msg",msg);
            return StateMsg.toJson(-2, map);
        }

        return StateMsg.toJson(1, map);
    }

    /**
     * URL:http://localhost:8080/alert/summary/getCount.do?insertTime=@@@&packageType=1
     * 查询insertTime之后更新的条数
     * @param map
     * @param insertTime
     * @param packageType 1:Grids_Anomaly_Cache; 2:Inbound_Outbound_Cache; 3:Ships_Anomaly_Cache;
     *                    4:AIS_Device_Offline_Cache;5:Ship_Rendezvous_Cache
     * @return 更新条数int
     */
    @ResponseBody
    @RequestMapping(value = "getCount.do",method = RequestMethod.GET)
    public String getSummaryCount(ModelMap map,@RequestParam Integer insertTime,@RequestParam Short packageType) {
        int count;
        if (packageType == 1) {
            count= cacheService.getGridsAnomlyCacheCount(insertTime);
            if (count != -1) {
                map.addAttribute("count", count);
                return StateMsg.toJson(1, map);
            } else {
                map.addAttribute("error", "Failure");
                return StateMsg.toJson(-1, map);
            }
        }
        if (packageType == 2){
            count= cacheService.getInboundOutboundCacheCount(insertTime);
            if (count != -1) {
                map.addAttribute("count", count);
                return StateMsg.toJson(1, map);
            } else {
                map.addAttribute("error", "Failure");
                return StateMsg.toJson(-1, map);
            }
        }
        if (packageType == 3){
            count= cacheService.getShipsAnomlyCacheCount(insertTime);
            if (count != -1) {
                map.addAttribute("count", count);
                return StateMsg.toJson(1, map);
            } else {
                map.addAttribute("error", "Failure");
                return StateMsg.toJson(-1, map);
            }
        }
        if (packageType == 4){
            count= cacheService.getAIS_Device_Offline_CacheCount(insertTime);
            if (count != -1) {
                map.addAttribute("count", count);
                return StateMsg.toJson(1, map);
            } else {
                map.addAttribute("error", "Failure");
                return StateMsg.toJson(-1, map);
            }
        }
        if (packageType == 5){
            count= cacheService.getShip_Rendezvous_CacheCount(insertTime);
            if (count != -1) {
                map.addAttribute("count", count);
                return StateMsg.toJson(1, map);
            } else {
                map.addAttribute("error", "Failure");
                return StateMsg.toJson(-1, map);
            }
        }

        String msg="输入packageType错误，packageType取值1~5";
        map.addAttribute("msg",msg);
        return StateMsg.toJson(-2, map);
    }
}