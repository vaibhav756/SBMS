package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.ProductDto;
import com.entity.ProductEntity;
import com.repository.ProductRepository;
import com.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public boolean saveProduct(ProductDto dto) {
		ProductEntity ent=new ProductEntity();
		BeanUtils.copyProperties(dto,ent);
		repo.save(ent);
		return true;
	}
	
	@Override
	public List<ProductDto> getProduct()
	{
		List<ProductDto> dtoList=new ArrayList<>();
		List<ProductEntity> entityList = repo.findAll();
		
		//BeanUtils.copyProperties(entityList, dtoList);
		ModelMapper mm=new ModelMapper();
		dtoList=entityList.stream().map(ent->this.map(ent, new ProductDto())).collect(Collectors.toList());
		//mm.addMappings(propertyMap<entityList,dtoList>);
		//mm.map(entityList, dtoList);
		return dtoList;
		
	}

	public static <S,D> D map(final S source,D destination)
	{
		ModelMapper mm=new ModelMapper();
		mm.map(source, destination);
		return destination;
	}
	
}
