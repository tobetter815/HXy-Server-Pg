package com.ict.dao;

import com.ict.model.InboundOutboundCache;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InboundOutboundCacheDao {

    List<InboundOutboundCache> getInboundOutboundCache(@Param("insertTime") Double insertTime, @Param("num") Long num);

    Integer getCount(@Param("insertTime") Integer insertTime);
}