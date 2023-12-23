package com.dao;

import org.springframework.stereotype.Repository;

//@Repository("dao") Autowiring byName
@Repository("oraclerepo")
public class OracleDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("Getting data from Oracle DB.");
	}

}
