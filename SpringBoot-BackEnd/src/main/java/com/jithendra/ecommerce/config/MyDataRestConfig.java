package com.jithendra.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.jithendra.ecommerce.entity.Product;
import com.jithendra.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.DELETE,HttpMethod.POST};
		
		//Disable Http methods for Product:PUT,DELETE,POST
		config.getExposureConfiguration()
			.forDomainType(Product.class)
			.withItemExposure((matadata,httpMethods)->httpMethods.disable(theUnsupportedActions))
			.withCollectionExposure((metaData,httpMethods)->httpMethods.disable(theUnsupportedActions));
		
		//Disable Http methods for ProductCategory:PUT,DELETE,POST
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((matadata,httpMethods)->httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metaData,httpMethods)->httpMethods.disable(theUnsupportedActions));
	}
	

}
