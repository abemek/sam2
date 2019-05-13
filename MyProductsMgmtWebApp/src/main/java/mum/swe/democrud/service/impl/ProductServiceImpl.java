package mum.swe.democrud.service.impl;

import mum.swe.democrud.model.Product;
import mum.swe.democrud.repository.ProductRepository;
import mum.swe.democrud.repository.ProductRepository;
import mum.swe.democrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product student) {
        return productRepository.save(student);
    }

    @Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);
    }
}
