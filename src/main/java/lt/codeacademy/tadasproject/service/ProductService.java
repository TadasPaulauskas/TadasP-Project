package lt.codeacademy.tadasproject.service;

import java.util.List;

import lt.codeacademy.tadasproject.model.Product;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
