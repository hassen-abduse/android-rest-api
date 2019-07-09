package com.bus.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.ticket.model.Ticket;
import com.bus.ticket.repository.TicketRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketRepository ticketRepo;
	
	@PostMapping("/buy")
	public Ticket butTicket(@RequestBody Ticket ticket)
	{
		return ticketRepo.save(ticket);
	}
	
	@DeleteMapping("/{TicketId}")
	public void returnTicket(@PathVariable("TicketId") int TicketId)
	{
		ticketRepo.deleteById(TicketId);
	}

}
