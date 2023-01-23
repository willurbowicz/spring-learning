package com.wurbo.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method setFortuneService");

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
