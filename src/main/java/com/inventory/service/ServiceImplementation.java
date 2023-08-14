package com.inventory.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.dto.ProductDTO;
import com.inventory.model.Product;
import com.inventory.repository.RepositoryImplementation;

@Service
public class ServiceImplementation implements ProductManagementServiceContracts {

	@Autowired
	private RepositoryImplementation repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean createProduct(ProductDTO productDTO) {
		Product createsProduct = modelMapper.map(productDTO, Product.class);
		repository.insertIntoProductTable(createsProduct);
		return true;
	}

	@Override
	public ProductDTO getProduct(Long productId) {
		Product getsProduct = repository.selectFromProductTable(productId);
		ProductDTO productDTO = modelMapper.map(getsProduct, ProductDTO.class);
		return productDTO;
	}
	
	@Override
	public ProductDTO updateProduct(Long productId, ProductDTO productDTO) {
		Product recordFromDatabase = repository.selectFromProductTable(productId);
		
		recordFromDatabase.setPrice(recordFromDatabase.getPrice());
		recordFromDatabase.setSupplier(recordFromDatabase.getSupplier());
		
		Product updatedValue = repository.updateIntoProductTable(productId, recordFromDatabase);
		ProductDTO newproductDTO = modelMapper.map(updatedValue, ProductDTO.class);
		return newproductDTO;

	}

	@Override
	public boolean deleteProduct(Long productId) {
		repository.deleteFromProductTable(productId);
		return true;
	}

}
