package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	
	//@Qualifier("OracleDb")
	//@Qualifier("mysqlrepo") based on name of bean if we identify bean then we can go with @Qualifier annotation
	private ReportDao dao;
	
	public ReportService() {
		System.out.println("ReportService Constructor executed...");
	}
	
	public ReportService(ReportDao dao) {
		System.out.println("ReportService Parameterized Constructor executed...");
		this.dao=dao;
	}
	
	@Autowired
	public void setDao(ReportDao dao)
	{
		System.out.println("ReportService setter method executed...");
		this.dao=dao;
	}
	
	public void generateReport()
	{
		dao.getData();
	}
	
}