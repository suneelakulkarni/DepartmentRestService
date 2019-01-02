package com.rest.department;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside run of DepartmentApplication");
	}
}

