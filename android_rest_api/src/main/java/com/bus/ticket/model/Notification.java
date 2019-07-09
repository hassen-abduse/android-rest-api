package com.bus.ticket.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="notification")
public class Notification {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "notification_id")
	private int motificationId;
	
	@NotNull
	@Column(name="message")
	private String message;
	
}
