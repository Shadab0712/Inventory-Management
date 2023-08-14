package com.inventory.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.inventory.dto.ProductDTO;

public interface ProductManagementAPIContracts {
	
	@PostMapping("/api/v1/product")
	public ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO);
	
	@GetMapping("/api/v1/product/{productId}")
	public ResponseEntity<ProductDTO> getProduct(@PathVariable Long productId);

	@PutMapping("/api/v1/product/{productId}")
	public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long productId , @RequestBody ProductDTO productDTO);
	
	@DeleteMapping("/api/v1/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long productId);

}
