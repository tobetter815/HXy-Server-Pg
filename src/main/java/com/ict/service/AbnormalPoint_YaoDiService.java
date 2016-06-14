package com.ict.service;

import com.ict.dao.IAbnormalPoint_YaoDiDao;
import com.ict.model.AbnormalPoint_YaoDi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: StevenH
 * Date: 2015/9/17
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AbnormalPoint_YaoDiService {
    @Resource
    IAbnormalPoint_YaoDiDao abnormalPoint_yaoDiDao;
    public List<Integer> listMMSI(){
        List<Integer> list=abnormalPoint_yaoDiDao.listMMSI();
        return list;
    }

    public List<AbnormalPoint_YaoDi> listPoints(int mmsi){
        List<AbnormalPoint_YaoDi> list=abnormalPoint_yaoDiDao.listPoints(mmsi);
        return list;
    }
}
