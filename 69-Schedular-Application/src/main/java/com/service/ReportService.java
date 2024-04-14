package com.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	//@Scheduled(fixedRate=3000)
	@Scheduled(cron="0 * * * * *")
	public void generateReport()
	{
		System.out.println("Report generated...!!!");
	}
	
}
