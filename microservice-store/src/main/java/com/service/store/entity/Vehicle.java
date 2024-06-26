package com.service.store.entity;

import java.util.Date;

public class Vehicle {
	
	private Long id;
	private String name;
	
	private String marca;
	
	private String placa;
	
	private Date createdAt;
	
	private Integer port;
	
	public Vehicle(Long id, String name, String marca) {
		this.id=id;
		this.name=name;
		this.marca=marca;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
	
	
}
