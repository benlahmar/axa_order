package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Composant;

public interface IComposant extends JpaRepository<Composant, Long>{

}
