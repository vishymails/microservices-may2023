package com.bvr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}

	
	@Autowired
	private BookRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(DbServiceApplication.class);
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		log.info("DB APPLICATION STARTED");
		
		repository.save(new Book("Spark"));
		repository.save(new Book("pyspark"));
		repository.save(new Book("Scala"));
		repository.save(new Book("Golang"));
		repository.save(new Book("Javascript"));
		repository.save(new Book("python"));
		repository.save(new Book("Java"));
		
	}

}
