package com.lnk.marts.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
	
	private Integer id;
	Order order;
	Customer customer;
	private float amount;
	private LocalDate paymentDate;
	private String status;
	private Integer recordStatus;
	

}
