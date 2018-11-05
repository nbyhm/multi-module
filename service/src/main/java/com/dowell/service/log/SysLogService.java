package com.dowell.service.log;

import com.dowell.dal.model.SysLog;

import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description
 * @create 2018-11-05
 **/
public interface SysLogService {

	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<SysLog> list(Map<String, Object> params);
}
