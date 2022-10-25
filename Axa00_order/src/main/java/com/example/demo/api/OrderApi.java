package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Command;
import com.example.demo.entities.User;

@RestController
public class OrderApi {

	@Autowired
	com.example.demo.repos.ICommand crepo;
	@Autowired
	IClient iclient;
	
	@PostMapping("/commands")
	public ResponseEntity<Command> addcmd(@RequestBody Command cmd)
	{
		//verifier existance du client
		//api rest avec l'app client
		User u = iclient.getbyid(cmd.getIdclient());
		if(u!=null)
		{
			cmd.setUser(u);
			cmd=crepo.save(cmd);
		  return new ResponseEntity<Command>(cmd,HttpStatus.CREATED);
		}else
		{
			return new ResponseEntity<Command>(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/commands/{id}")
	public Command findcmd(@PathVariable long id)
	{
		Command cmd = crepo.findById(id).get();
		//
		User u = iclient.getbyid(cmd.getIdclient());
		
		cmd.setUser(u);
		return cmd;
	}
}
