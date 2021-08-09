package com.toy.pbsetting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class PbsettingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbsettingApplication.class, args);
	}

	@GetMapping("/test")
	public ResponseEntity<?> get() {
	    return ResponseEntity.ok("hello");
	}

}
