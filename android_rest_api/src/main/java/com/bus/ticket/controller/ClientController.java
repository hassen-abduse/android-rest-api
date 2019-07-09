package com.bus.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.ticket.model.Bus;
import com.bus.ticket.model.Client;
import com.bus.ticket.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientRepository clientRepo;
	
	@PostMapping("/add")
	public Client register(@RequestBody Client client)
	{
		return clientRepo.save(client);
	}
	
	@GetMapping("/all")
	public Iterable<Client> allClient()
	{
		return clientRepo.findAll();
	}
	
	@GetMapping("/{username}")
	public Iterable<Client> login(@PathVariable("username") String username)
	{
		return clientRepo.findByUsername(username);
	}
	
	@PutMapping("/update")
	public Client updateBus(@RequestBody Client client)
	{
		return clientRepo.save(client);
	}
	
	@DeleteMapping("/{ClientId}")
	public void deleteBus(@PathVariable("busId") int ClientId)
	{
		clientRepo.deleteById(ClientId);
	}
	
}
