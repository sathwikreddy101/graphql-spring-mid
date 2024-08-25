package com.graphql.springbootgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootgraphqlApplication {

//	@Autowired
//	private ProductRepository productRepository;
//
//	@PostConstruct
//	public void initDB(){
//		List<Product> products = Stream.of(
//				new Product("Laptop", "Electronics", 74999.99f,50),
//				new Product("Smartphone", "Electronics", 39999.99f,100),
//				new Product("Office Chair", "Furiniture", 7999.99f, 200),
//				new Product("Notebook", "Stationary", 99.99f, 500),
//				new Product("Desk lamp", "Furniture", 1999.9f, 150),
//				new Product("Water Bottle", "Accessories", 499.99f, 1000)
//		).collect(Collectors.toList());
//		productRepository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootgraphqlApplication.class, args);
	}

}
