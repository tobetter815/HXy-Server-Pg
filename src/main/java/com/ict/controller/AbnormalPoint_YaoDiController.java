package com.ict.controller;

import com.alibaba.fastjson.JSON;
import com.ict.model.AbnormalPoint_YaoDi;
import com.ict.service.AbnormalPoint_YaoDiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * User: StevenH
 * Date: 2015/9/17
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AbnormalPoint_YaoDiController {
    @Resource
    AbnormalPoint_YaoDiService abnormalPoint_yaoDiService;

    @ResponseBody
    @RequestMapping(value = "getAbnormalPointMMSI.do",method = RequestMethod.GET)
    public String listMMSI(ModelMap map){
        List<Integer> list=abnormalPoint_yaoDiService.listMMSI();
        int size=list.size();
        map.addAttribute("count",size);
        map.addAttribute("mmsi",list);
        String jsonStr = JSON.toJSONString(map);

        /**控制台输出调试信息*/
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("Hi~ o(*￣▽￣*)ブ");
        System.out.println("**Server:" + df.format(new Date()) + "**");// new Date()为获取当前系统时间
        System.out.println("Action:\tgetAbnormalPointMMSI.do");
        System.out.print("Input:");
        System.out.println("\t@NULL");
        System.out.print("Output:");
        System.out.println("\t#mmsi:List<int>\t#count:" + size);
        System.out.println("**End**");
        System.out.println("ヾ(￣▽￣)Bye~Bye~");

        return jsonStr;
    }

    @ResponseBody
    @RequestMapping(value = "getAbnormalPoints.do",method = RequestMethod.GET)
    public String listPoints(ModelMap map,@RequestParam int mmsi){
        List<AbnormalPoint_YaoDi> list=abnormalPoint_yaoDiService.listPoints(mmsi);
        int size=list.size();
        map.addAttribute("count",size);
        map.addAttribute("pointList",list);
        String jsonStr = JSON.toJSONString(map);

        /**控制台输出调试信息*/
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("Hi~ o(*￣▽￣*)ブ");
        System.out.println("**Server:" + df.format(new Date()) + "**");// new Date()为获取当前系统时间
        System.out.println("Action:\tgetAbnormalPoints.do");
        System.out.print("Input:");
        System.out.println("\t@mmsi:"+mmsi);
        System.out.print("Output:");
        System.out.println("\t#pointList:List<point>\t#count:" + size);
        System.out.println("**End**");
        System.out.println("ヾ(￣▽￣)Bye~Bye~");

        return jsonStr;
    }
}
