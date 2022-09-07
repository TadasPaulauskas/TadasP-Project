package lt.codeacademy.tadasproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.codeacademy.tadasproject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
