package com.lnk.marts.repo;

import org.springframework.data.repository.CrudRepository;

import com.lnk.marts.domain.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

}
