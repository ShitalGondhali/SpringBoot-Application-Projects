package com.spring.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{

	@GetMapping("/productdetails")
	public List<Product> getAllProductDetails()
	{
		return ProductService.getProductDetails();
	}
		

	@GetMapping("/productdetails/{productId}")
	public Product getProductById(@PathVariable int productId)
	{
		return ProductService.getProductDetailsById(productId);
	}

	@PostMapping("/addproductdetails")
	public Product addProduct(@RequestBody Product prod)
	{
		return ProductService.addProductDetails(prod);
	}

	@PutMapping("/updateproductdetails/{productId}")
	public Product updateProduct(@PathVariable int productId,@RequestBody Product prod)
	{
		return ProductService.updateProductDetails(productId,prod);
	}
	
	@DeleteMapping("/removeproductdetails/{productId}")
	public Product removeProduct(@PathVariable int productId)
	{
		return ProductService.removeProductDetailsById(productId);
	}
}
