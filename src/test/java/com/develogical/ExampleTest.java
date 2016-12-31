package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {
	@Test 
	public void canAnswerTheUniversalQuestion() {
		assertThat(new Example().answer(), is(42));
	}
}
