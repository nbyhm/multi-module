package com.dowell.dal.mapper;

import com.dowell.config.MyMapper;
import com.dowell.dal.model.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author nanbo
 * @description
 * @create 2018-11-05
 **/
@Component
@Mapper
public interface SysLogMapper extends MyMapper<SysLog> {

}
