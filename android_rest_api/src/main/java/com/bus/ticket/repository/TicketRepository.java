package com.bus.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.bus.ticket.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
