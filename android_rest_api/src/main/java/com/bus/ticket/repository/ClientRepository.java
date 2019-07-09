package com.bus.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import com.bus.ticket.model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

	Iterable<Client> findByUsername(String username);

}
