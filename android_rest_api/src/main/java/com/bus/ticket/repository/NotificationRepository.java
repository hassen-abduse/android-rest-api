package com.bus.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.bus.ticket.model.Notification;

public interface NotificationRepository extends CrudRepository<Notification,Integer>  {

}
