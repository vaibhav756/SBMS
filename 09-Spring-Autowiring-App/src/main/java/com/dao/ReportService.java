package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Autowired
	//@Qualifier("mysqlrepo") based on name of bean if we identify bean then we can go with @Qualifier annotation
	private ReportDao dao;
	
	public void generateReport()
	{
		dao.getData();
	}
	
}
