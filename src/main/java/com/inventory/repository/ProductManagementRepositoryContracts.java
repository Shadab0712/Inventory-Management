package com.inventory.repository;

import com.inventory.model.Product;

public interface ProductManagementRepositoryContracts {

	public boolean insertIntoProductTable(Product product);

	public Product selectFromProductTable(Long productId);

	public Product updateIntoProductTable(Long productId, Product product);

	public boolean deleteFromProductTable(Long productId);

}
