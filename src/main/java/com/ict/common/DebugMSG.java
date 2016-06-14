package com.ict.common;

/**
 * User: StevenH
 * Date: 15-7-25
 * Time: 下午10:43
 * To change this template use File | Settings | File Templates.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**控制台输出调试信息*/
public class DebugMSG {

    public void outPutMSG(String actionName,Map<String,Object> input,Map<String ,Object> output,int size ){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("Hi~ o(*￣▽￣*)ブ");
        System.out.println("**Server:" + df.format(new Date()) + "**");// new Date()为获取当前系统时间
        System.out.println("Action:\t"+actionName);
        System.out.print("Input:");
        System.out.println("\tNULL");
        System.out.print("Output:");
        System.out.println("\t#"+output.getClass()+":List\t#Count:" + size);
        System.out.println("**End**");
        System.out.println("ヾ(￣▽￣)Bye~Bye~");
    }


}
