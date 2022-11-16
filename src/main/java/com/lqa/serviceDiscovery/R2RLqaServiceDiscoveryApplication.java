package com.lqa.serviceDiscovery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class R2RLqaServiceDiscoveryApplication {

	private static final Logger Log = LogManager.getLogger(R2RLqaServiceDiscoveryApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(R2RLqaServiceDiscoveryApplication.class, args);
		Log.info("LQA Service Discovery Started Successfully::");
	}

}
