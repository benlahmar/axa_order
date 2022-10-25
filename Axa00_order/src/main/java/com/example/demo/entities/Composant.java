package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Composant {
	@Id@GeneratedValue
	long id;
	int qte;
	double prix;
	
	@ManyToOne
	Command command;
	
	@Transient
	Produit produit;
	
	long idproduit;
	
	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public long getIdproduit() {
		return idproduit;
	}

	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}
	
}
