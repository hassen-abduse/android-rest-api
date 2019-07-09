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
import com.bus.ticket.repository.BusRepository;

@RestController
@RequestMapping("/bus")
public class BusController {

	@Autowired
	BusRepository busRepo;
	
	@PostMapping("/add")
	public Bus saveBus(@RequestBody Bus bus)
	{
		return busRepo.save(bus);
	}
	
	@GetMapping("/all")
	public Iterable<Bus> allBus()
	{
		return busRepo.findAll();
	}
	
	@PutMapping("/update")
	public Bus updateBus(@RequestBody Bus bus)
	{
		return busRepo.save(bus);
	}
	
	@DeleteMapping("/{busId}")
	public void deleteBus(@PathVariable("busId") int busId)
	{
		busRepo.deleteById(busId);
	}
	
	@GetMapping("/{destination}")
	public Iterable<Bus> findByDestination(@PathVariable("destination") String destination)
	{
		return busRepo.findByDestination(destination);
	}
}
