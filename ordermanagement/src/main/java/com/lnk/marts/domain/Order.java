package com.lnk.marts.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order implements Serializable {

	
	@Id
	@GeneratedValue
	private Integer id;
	@Column 
	private LocalDate orderDate;
	@Column(length=2000)
	private String shipToAddress;
	@Column
	private LocalDate shipToDate;
	@Column
	private String orderStatus;
	@Column
	Customer customer;
	@Column
	private Float orderAmount;
	@Column
	private Integer recordStatus;
	
	
	

}
