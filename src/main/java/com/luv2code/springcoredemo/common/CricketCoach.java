package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class CricketCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practise for a hour daily by method";
		
	}
	

}
