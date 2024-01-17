package com.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyApp CommandLine Runner Executed...");
	}

}
