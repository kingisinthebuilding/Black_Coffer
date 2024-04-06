package com.blackcoffer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.service.Services;

@RestController
public class Controller {
	
	@Autowired
	private Services service;
	
	@GetMapping("/intensity")
	public ResponseEntity<List<String>> getIntensity()
	{
		List<String> list = service.getIntensity();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}

	@GetMapping("/relevance")
	public ResponseEntity<List<String>> getRelevance()
	{
		List<String> list = service.getRelevance();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/likehood")
	public ResponseEntity<List<String>> getLikelihood()
	{
		List<String> list = service.getLikelihood();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/year")
	public ResponseEntity<List<String>> getYear()
	{
		List<String> list = service.getYear();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/country")
	public ResponseEntity<List<String>> getCountry()
	{
		List<String> list = service.getCountry();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/topic")
	public ResponseEntity<List<String>> getTopic()
	{
		List<String> list = service.getTopic();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/region")
	public ResponseEntity<List<String>> getRegion()
	{
		List<String> list = service.getRegion();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/city")
	public ResponseEntity<List<String>> getCity()
	{
		List<String> list = service.getCity();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
}
