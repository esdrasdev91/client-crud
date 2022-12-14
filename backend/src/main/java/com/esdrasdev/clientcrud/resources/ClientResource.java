package com.esdrasdev.clientcrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esdrasdev.clientcrud.entities.Client;

@RestController
@RequestMapping(value = "/clienties")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity <List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client ());
		return ResponseEntity.ok().body(list);
	}
}
