package com.bus.ticket.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="bus")
public class Bus {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "bus_id")
	private int busId;
	
	@NotNull
	@Column(name="bus_number")
	private int busNumber;
	
	@NotNull
	@Column(name="bus_route")
	private String route;
	
	@NotNull
	@Column(name="starting_place")
	private String startPlace;
	
	@NotNull
	@Column(name="destination")
	private String destination;
	
	@NotNull
	@Column(name="seat_number")
	private int seatNumber;
	
	@OneToMany(mappedBy = "bus", cascade = CascadeType.ALL)
    private Set<Ticket> ticket;

}
