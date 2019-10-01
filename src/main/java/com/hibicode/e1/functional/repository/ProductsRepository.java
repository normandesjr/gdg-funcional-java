package com.hibicode.e1.functional.repository;

import com.hibicode.e1.functional.model.Product;

import java.util.List;

public interface ProductsRepository {

    public List<Product> findAll();

}
