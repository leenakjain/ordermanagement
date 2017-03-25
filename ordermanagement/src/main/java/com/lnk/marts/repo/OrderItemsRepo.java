package com.lnk.marts.repo;

import org.springframework.data.repository.CrudRepository;

import com.lnk.marts.domain.OrderItems;

public interface OrderItemsRepo extends CrudRepository<OrderItems, Integer>{

	
}
