package com.is.newto.shoeshop.product;
import com.is.newto.shoeshop.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}