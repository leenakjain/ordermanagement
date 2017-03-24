package com.lnk.marts.domain;

import java.io.Serializable;

public class OrderItems implements Serializable {

	private Integer id;
	private Integer quantity;
	private float price;
	Product product;
	Order order;
	private String recordStatus;
}
