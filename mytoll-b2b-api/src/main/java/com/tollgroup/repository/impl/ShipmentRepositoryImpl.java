package com.tollgroup.repository.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tollgroup.repository.ShipmentRepository;

@Repository
public class ShipmentRepositoryImpl implements ShipmentRepository {
	
	@Autowired
	@Qualifier("readJdbcTemplate")
	private JdbcTemplate readJdbcTemplate;
	
	@Autowired
	@Qualifier("writeJdbcTemplate")
	private JdbcTemplate writeJdbcTemplate;
	
	@Override
	public String getShipmentNumber() {
		String query = "select shipment_number from shipment where shipment_id=1";
		return readJdbcTemplate.queryForObject(query, String.class);
	}

}
