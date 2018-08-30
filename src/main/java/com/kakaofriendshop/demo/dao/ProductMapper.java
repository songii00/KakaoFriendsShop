package com.kakaofriendshop.demo.dao;

import com.kakaofriendshop.demo.model.Product;

public interface ProductMapper {
	/* DB Select  */
    public int getProductPrice(String commentIndex) throws Exception;
    public Product getProduct(String commentIndex) throws Exception;
}