package com.ict.dao;

import com.ict.model.AbnormalPoint_YaoDi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: StevenH
 * Date: 2015/9/17
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface IAbnormalPoint_YaoDiDao {
    public List<Integer> listMMSI();
    public List<AbnormalPoint_YaoDi> listPoints(@Param("mmsi") int mmsi);
}
