package com.toy.pbsetting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PbsettingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbsettingApplication.class, args);
	}

}
