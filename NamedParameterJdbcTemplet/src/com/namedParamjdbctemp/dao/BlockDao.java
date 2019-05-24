package com.namedParamjdbctemp.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
@Repository
public class BlockDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;	
	
	private final String QUARY_BLOCK_BY_ZONE="SELECT COUNT(1) FROM BLOCK WHERE ZONE>=:p_ZONE";
	Map<String, Object> blockMap;
	
	@Autowired
	public BlockDao(DataSource dataSource) {		
	jdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	
	public int getBlockbycapacity(String zone) {
		blockMap=new HashMap<>();
		blockMap.put("p_ZONE", zone);
		return jdbcTemplate.queryForInt(QUARY_BLOCK_BY_ZONE, blockMap);
		
	}
	

}
