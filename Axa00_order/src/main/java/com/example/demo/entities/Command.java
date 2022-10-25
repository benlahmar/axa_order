package com.example.demo.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Command {
	@Id
	@GeneratedValue
	long id;
	LocalDate date;	
	
	@Transient
	User user;	
	long idclient;
	
	@OneToMany(mappedBy = "command")
	List<Composant> composants;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getIdclient() {
		return idclient;
	}

	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}

	
	
	
}
