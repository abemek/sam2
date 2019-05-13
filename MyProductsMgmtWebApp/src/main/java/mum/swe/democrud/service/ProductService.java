package mum.swe.democrud.service;

import mum.swe.democrud.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product save(Product student);
    Product findOne(Long id);
    void delete(Long id);
}
