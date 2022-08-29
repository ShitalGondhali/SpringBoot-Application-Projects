package com.spring.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {

	private static Map<Integer, Product> mapProduct = new HashMap();
	private static int index = 0;

	static {
		Product product1 = new Product(1, "Watch", 1750, "Electrical", 35);
		Product product2 = new Product(2, "Dress material", 1500, "Cloths", 20);
		Product product3 = new Product(3, "Beauty Cream", 50, "Cosmetics", 40);

		mapProduct.put(1, product1);
		mapProduct.put(2, product2);
		mapProduct.put(3, product3);

	}

	public static List<Product> getProductDetails() {
		return new ArrayList<>(mapProduct.values());
	}

	public static Product getProductDetailsById(int productId) {
		return mapProduct.get(productId);
	}

	public static Product addProductDetails(Product prod) {
		index += 1;
		prod.setProductId(index);
		mapProduct.put(index, prod);

		return prod;

	}

	public static Product updateProductDetails(int productId, Product prod) {

		prod.setProductId(productId);
		mapProduct.put(productId, prod);

		return prod;

	}

	public static Product removeProductDetailsById(int productId) {
		return mapProduct.remove(productId);
	}
}
