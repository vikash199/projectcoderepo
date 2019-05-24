package com.namedParamjdbctemp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.namedParamjdbctemp.config.NPJdbcConfig;
import com.namedParamjdbctemp.dao.BlockDao;


public class NPJdbcTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(NPJdbcConfig.class);
		BlockDao blockDao = context.getBean("blockDao",BlockDao.class);
		int i=blockDao.getBlockbycapacity("north");
		System.out.println(""+i);
	}
}
