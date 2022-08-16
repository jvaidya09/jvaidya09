package com.example.Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@Column(name ="pName")
	private String prodName;
	@Column(name = "pId")
	private Integer prodId;
	@Column(name = "pCost")
	private Double prodCost;
	@Column(name ="pVen")
	private String prodprodVen;

}
