package com.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class InsertRunner implements CommandLineRunner {

	@Autowired
	private ProdRepository repo;
	public void run(String... args) throws Exception {
		
		repo.save(new Product("milk",10,100.10,"appl"));
		repo.save(new Product("ata",20,200.0,"Abc"));
		repo.save(new Product("piza",30,300.10,"xyz"));
		repo.save(new Product("burger",40,400.10,"Abc"));
		
		
		

	}

}
