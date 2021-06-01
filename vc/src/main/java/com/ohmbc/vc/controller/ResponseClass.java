package com.ohmbc.vc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ohmbc.vc.model.*;

@RestController
public class ResponseClass {

	@PostMapping("/professional-acces")
	public ProfessionalAcces accespro(@RequestBody ProfessionalAcces professionalAcces) {

		//System.out.println(professionalAcces.toString());
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:8080/responsefromserver/";

		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		return professionalAcces;
	}
	
	@PostMapping("/user-acces-consultation")
	public AccesConsultation accesUser(@RequestBody AccesConsultation test) {
	
		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:8080/responsefromserver/";

		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		return test;
	}
	
	

	
	@GetMapping("/responsefromserver")
	public String ejemplo2() {
	
	return "ok from responsefromserver";
		  }
	
}
