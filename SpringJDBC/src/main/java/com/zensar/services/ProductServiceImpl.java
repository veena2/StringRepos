package com.zensar.services;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
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

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> findAllProducts() {

		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		Product product = productDao.getById(productId);
		return product;
	}

	@Override
	public void add(Product product) {
		productDao.insert(product);
	}

	@Override
	public void update(Product product) {
		productDao.update(product);

	}

	@Override
	public void remove(Product product) {
		productDao.delete(product);

	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) {
		List<Product> allProducts=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:allProducts)
		{
			if(p.getPrice( )>=minPrice && p.getPrice()<=maxPrice)
			{
				
			list.add(p);
			}
			
		}
		return list;
	}

	@Override
	public List<Product> findProductsByName(String name) {
		List<Product> products=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:products)
		{
			if(p.equals(name))
			{
				
			list.add(p);
			}
			
		}
			return list;
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		List<Product> products=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:products)
		{
			if(p.equals(brand))
			{
				
			list.add(p);
			}
			
		}
			return list;
	}

	@Override
	public long getProductCount() {
		List<Product> allProducts=productDao.getAll();
		return (long) (allProducts.size());
	}

}
