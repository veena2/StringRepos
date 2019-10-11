package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;

/**
 * @author Veena Kumari
 * @creation_Date 4th Oct 2019 10:08AM
 * @modification_Date 4th Oct 2019 04:05PM
 * @version 2.0
 * @copyright Zensar Techonologies. All rights reserved.
 * @description It is a Product Dao Interface
 *                used in Persistent Layer
 *
 */
public interface ProductDao
{
List<Product> getAll();
Product getById(int productId);
void insert(Product product);
void update(Product product);
void delete(Product product);

}
