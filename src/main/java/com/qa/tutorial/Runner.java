package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) {
		Interaction runner = new Interaction();
		System.out.println(runner.greeting());
	}
	

// static item is outside of the instance therefore runner instance need to be created to access method inside the runner class.
// part of class but not part of instance. 
	

}
