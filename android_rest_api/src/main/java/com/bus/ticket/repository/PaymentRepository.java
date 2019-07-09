package com.bus.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.bus.ticket.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
