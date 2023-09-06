package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {
	private Coach coach;	

	
	@Autowired
	public DemoController(@Qualifier("swimCoach") Coach coach) {
		this.coach = coach;
		
	}



	@GetMapping("/")
	public String getDailyWorkoout() {
		
		
		
		
		return coach.getDailyWorkout();
	}
	
	
	

}
