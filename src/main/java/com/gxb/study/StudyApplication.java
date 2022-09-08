package com.gxb.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		System.out.println(args);
		//SpringApplication.run(StudyApplication.class, args);
		SpringApplication app = new SpringApplication(StudyApplication.class);
		app.run(args);
	}

}
