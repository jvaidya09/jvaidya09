package com.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductFindByTestRunner implements CommandLineRunner {

	@Autowired
	private ProdRepository repo;
	
	public void run(String... args) throws Exception {
//		
//		repo.findByprodId(101).forEach(System.out::println);
//		repo.findByprodName("m%").forEach(System.out::println);
//        repo.findByProdCostLessThan(400.1).forEach(System.out::println);
//	
		repo.getAllProducts().forEach(System.out::println);
		
		repo.getAllProductsIds().forEach(System.out::println);
		
		
		
	}

}
