package com.service;

import java.util.List;

import com.dto.ProductDto;

public interface ProductService {

	boolean saveProduct(ProductDto dto);
	List<ProductDto> getProduct();
}
