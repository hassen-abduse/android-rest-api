package com.bus.ticket.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="client")
public class Client {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "client_id")
	private int id;

	@NotNull
	@Column(name="client_username")
	private String username;
	
	@NotNull
	@Column(name="client_password")
	private String password;
	
	@NotNull
	@Column(name="client_phone")
	private int phone;
	
	@NotNull
	@Column(name="client_address")
	private String address;
	
	@NotNull
	@Column(name="client_relative")
	private String relative;
	
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "client")
	private Ticket ticket;
	
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "client")
	private Payment payment;
	
}
