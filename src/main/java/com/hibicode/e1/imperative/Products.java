package com.hibicode.e1.imperative;

import com.hibicode.e1.imperative.dto.ProductDto;
import com.hibicode.e1.imperative.model.Product;
import com.hibicode.e1.imperative.repository.ProductsRepository;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private ProductsRepository repository;

    public Products(ProductsRepository repository) {
        this.repository = repository;
    }

    public List<ProductDto> list() {
        List<Product> products = repository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for (Product product : products) {
            ProductDto dto = new ProductDto();
            dto.setDescription(product.getName() + " " + product.getVersion());
            dto.setActive(product.getDeactivationDate() == null);
            productDtos.add(dto);
        }

        return productDtos;
    }

}
