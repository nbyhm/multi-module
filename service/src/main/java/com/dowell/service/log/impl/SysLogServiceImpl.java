package com.dowell.service.log.impl;

import com.dowell.dal.mapper.SysLogMapper;
import com.dowell.dal.model.SysLog;
import com.dowell.service.log.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description
 * @create 2018-11-05
 **/
@Slf4j
@Service
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	SysLogMapper sysLogMapper;

	@Override
	public List<SysLog> list(Map<String, Object> params) {
		String key = (String)params.get("key");
		try {
			Example example = new Example(SysLog.class);
			Example.Criteria criteria = example.createCriteria();
			if (StringUtils.isNotBlank(key)) {
				criteria.orCondition("username like", "%" + key + "%")
						.orCondition("operation like", "%" + key + "%");
			}
			example.setOrderByClause("create_date desc");
			return sysLogMapper.selectByExample(example);
		} catch (Exception e) {
			log.error("获取系统日志失败" + e);
			return new ArrayList<>();
		}
	}
}
