package com.dowell.web.log;

import com.dowell.dal.model.SysLog;
import com.dowell.service.log.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

/**
 * @author nanbo
 * @description
 * @create 2018-11-05
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTests {

	@Autowired
	private SysLogService sysLogService;

	@Test
	public void logTest(){
		List<SysLog> list = sysLogService.list(new HashMap<>());
		log.info(list.get(0).getUsername());
	}
}
