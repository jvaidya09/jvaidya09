package com.example.Test;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepository extends JpaRepository<Product,Integer> {

	//	List<Product>findByprodName(String pname);
	//	List<Product>findByprodId(Integer pid);
	//     List<Product> findByProdCost(String pcost);
	//     List<Product> findByProdCostLessThan(Double prodCost);
	
	@Query("SELECT P FROM Product P")
	List<Product> getAllProducts();
	
	@Query("SELECT P.prodId FROM Product P")
	List<Integer> getAllProductsIds();

}
