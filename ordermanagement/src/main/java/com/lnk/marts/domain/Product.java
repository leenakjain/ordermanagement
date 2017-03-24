package com.lnk.marts.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Product implements Serializable {

	private Integer id;
	private String	name;
	private String description;
	ProductCategory category;
	private String tags;
	private Float price;
	private Integer recordStatus;
	
}
