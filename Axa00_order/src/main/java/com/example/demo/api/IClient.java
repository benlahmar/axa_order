package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.User;

@FeignClient(url = "http://localhost:8080", 
		name = "clientservice")
public interface IClient {

	@GetMapping("/users/{id}")
	public User getbyid(@PathVariable long id);
}
