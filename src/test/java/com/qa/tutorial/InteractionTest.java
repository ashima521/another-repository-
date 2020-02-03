package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test; // import repository from maven repository to pom.xml

public class InteractionTest {

	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("Hi friend", interaction.greeting());
	}
	
}

