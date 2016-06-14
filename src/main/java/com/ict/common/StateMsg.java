package com.ict.common;

import com.alibaba.fastjson.JSON;
import org.springframework.ui.ModelMap;

/**
 * User: Tainy
 * Date: 2015/11/25
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public class StateMsg {
    private ModelMap msg;

    private int state;

    public StateMsg(ModelMap msg, int state) {
        this.msg = msg;
        this.state = state;
    }

    public ModelMap getMsg() {
        return msg;
    }

    public void setMsg(ModelMap msg) {
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static String toJson(int state, ModelMap msg){

        return JSON.toJSONString(toModelMap(state,msg));
    }

    public static ModelMap toModelMap(int state,ModelMap msg){
        ModelMap map = new ModelMap();
        map.addAttribute("state",state);
        map.addAttribute("msg",msg);
        return map;
    }
}
