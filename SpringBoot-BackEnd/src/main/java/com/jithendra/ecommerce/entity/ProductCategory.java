package com.jithendra.ecommerce.entity;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="product_category")
@Getter
@Setter
public class ProductCategory {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Product> products;

}
