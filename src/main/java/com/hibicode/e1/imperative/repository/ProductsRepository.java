package com.hibicode.e1.imperative.repository;

import com.hibicode.e1.imperative.model.Product;

import java.util.List;

public interface ProductsRepository {

    public List<Product> findAll();

}
