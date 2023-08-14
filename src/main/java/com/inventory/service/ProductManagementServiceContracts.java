package com.inventory.service;

import com.inventory.dto.ProductDTO;

public interface ProductManagementServiceContracts {

	public boolean createProduct(ProductDTO productDTO);

	public ProductDTO getProduct(Long productId);
	
	public ProductDTO updateProduct(Long productId, ProductDTO productDTO);

	public boolean deleteProduct(Long productId);

}
