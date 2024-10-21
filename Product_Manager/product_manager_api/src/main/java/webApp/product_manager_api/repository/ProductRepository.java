package webApp.product_manager_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webApp.product_manager_api.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
