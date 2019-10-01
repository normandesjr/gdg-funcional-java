package com.hibicode.e1.functional;

import com.hibicode.e1.functional.dto.ProductDto;
import com.hibicode.e1.functional.repository.ProductsRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Products {

    private ProductsRepository repository;

    public Products(ProductsRepository repository) {
        this.repository = repository;
    }

    public List<ProductDto> list() {
        return repository.findAll().stream()
                .map(ProductDto::new).collect(Collectors.toList());
    }

}
