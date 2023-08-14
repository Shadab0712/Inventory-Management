package com.inventory.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inventory.model.Product;

@Repository
public class RepositoryImplementation implements ProductManagementRepositoryContracts {

	@Autowired
	private ProductManagementRepository repository;

	@Override
	public boolean insertIntoProductTable(Product product) {
		repository.save(product);
		return true;
	}

	@Override
	public Product selectFromProductTable(Long productId) {
		Optional<Product> productOptional = repository.findById(productId);
		if (productOptional.isPresent()) {
          Product getProduct = productOptional.get();
          return getProduct;
		}
		return null;
	}
	

	@Override
	public Product updateIntoProductTable(Long productId, Product product) {
		Product update = repository.save(product);
		return update;
	}

	@Override
	public boolean deleteFromProductTable(Long productId) {
		repository.deleteById(productId);
		return true;
	}
	
}
