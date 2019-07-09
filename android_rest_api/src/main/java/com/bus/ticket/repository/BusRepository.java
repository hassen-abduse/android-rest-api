package com.bus.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.bus.ticket.model.Bus;


public interface BusRepository extends CrudRepository<Bus, Integer> {

	Iterable<Bus> findByDestination(String destination);

}
