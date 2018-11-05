package com.dowell.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author nanbo
 * @description
 * @create 2018-11-02
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

