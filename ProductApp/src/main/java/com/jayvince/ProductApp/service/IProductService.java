package com.jayvince.ProductApp.service;

import com.jayvince.ProductApp.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product productDetails);
    String deleteProductById(Long id);

}
