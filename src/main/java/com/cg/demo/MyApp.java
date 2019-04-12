package com.cg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//comments
@SpringBootApplication
@EnableAutoConfiguration
public class MyApp {

		public static void main(String[] args) {
			SpringApplication.run(MyApp.class, args);

		}

}
