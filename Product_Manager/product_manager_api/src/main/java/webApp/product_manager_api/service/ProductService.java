package webApp.product_manager_api.service;

import java.util.List;

import webApp.product_manager_api.entity.Product;

public interface ProductService {
     
	public Product saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
	public Product editProduct(Product product , Integer id);
	
}
