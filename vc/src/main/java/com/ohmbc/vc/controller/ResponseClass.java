package com.ohmbc.vc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ohmbc.vc.model.*;

@RestController
public class ResponseClass {

	
	@PostMapping("/auth")
	public String auth (@RequestBody ProfessionalAcces professionalAcces) {

		//System.out.println(professionalAcces.toString());
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://bupanp-sanitas-pre.apigee.net/oauth2/api/v2/token?grant_type=client_credentials";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + "WlR1MHRBWjFldjdnRlI3ekFBVWU4N3lxbVN5TTFBd3o6RHNXbjc3WjhGU0dGaUl6bg==");
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		String token = response.getBody();
		return token;
	}
	
	
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
