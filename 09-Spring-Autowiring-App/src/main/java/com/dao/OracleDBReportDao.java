package com.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("dao") Autowiring byName
@Repository()
public class OracleDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("Getting data from Oracle DB.");
	}

}
