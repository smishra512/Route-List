package com.adidas.city.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "City")
public class City {
	
	@Id
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "SOURCE", nullable = false)
	private String source;
	
	
	@Column(name = "DESTINATION", nullable = false)
	private String destination;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ARRIVAL_TIME", nullable = false)
	private Date arrivalTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEPARCHER_TIME", nullable = false)
	private Date deparcherTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDeparcherTime() {
		return deparcherTime;
	}

	public void setDeparcherTime(Date deparcherTime) {
		this.deparcherTime = deparcherTime;
	}
	
	
	
	
	
}
