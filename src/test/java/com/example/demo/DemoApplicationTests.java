package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class DemoApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void findProducts_noProductDefined_returnsEmtpty(ApplicationContext context) {
		DefaultQueryRewriter bean = context.getBean(DefaultQueryRewriter.class);
		assertNotNull(bean);

		List<Product> products = productRepository.findProducts();
		assertTrue(products.isEmpty());
	}

}
