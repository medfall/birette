package com.birette;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiretteApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(BiretteApplication.class, args);
		System.out.println();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
