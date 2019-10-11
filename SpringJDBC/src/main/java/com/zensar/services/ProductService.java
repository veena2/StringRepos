package com.zensar.services;

import java.util.List;


import com.zensar.entities.Product;

/**
 * @author Veena Kumari
 * @creation_Date 4th Oct 2019 10:34AM
 * @modification_Date 4th Oct 2019 05:21PM
 * @version 2.0
 * @copyright Zensar Techonologies. All rights reserved.
 * @description It is a Product Service Interface
 *                used in Business Layer
 *
 */
public interface ProductService
{
List<Product> findAllProducts();
Product findProductById(int productId);
void add(Product product);
void update(Product product);
void remove(Product product);
List<Product> findProductsByPriceRange(float max,float min);
List<Product> findProductsByName(String name);
List<Product> findProductsByBrand(String brand);
long getProductCount();
}
