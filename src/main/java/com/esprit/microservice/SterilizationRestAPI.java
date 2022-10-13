package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservice.entities.Sterilization;
import com.esprit.microservice.service.SterilizationService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;


@RestController
@RequestMapping(value= "/api/sterilizations")
public class SterilizationRestAPI {
	private String title="Sterilization";
	@Autowired
	private SterilizationService sterilizationService;

	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Sterilization> createSterilization (@RequestBody Sterilization sterilization) {
	return new ResponseEntity<>(sterilizationService.addSterilization(sterilization), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sterilization> updateSterilization (@PathVariable (value= "id") int id,
	@RequestBody Sterilization sterilization){
		return new ResponseEntity<>(sterilizationService.updateSterilization(id, sterilization), HttpStatus.OK);
	}
	
	@DeleteMapping (value ="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus (HttpStatus.OK)
	public ResponseEntity<String> deleteSterilization (@PathVariable(value="id") int id){
	return new ResponseEntity<>(sterilizationService.deleteSterilization(id) , HttpStatus.OK);
	}
}
