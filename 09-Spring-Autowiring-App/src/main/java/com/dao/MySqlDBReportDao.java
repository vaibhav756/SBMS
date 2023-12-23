package com.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlrepo")
@Primary
public class MySqlDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("Getting data from MySql DB.");
	}

}
