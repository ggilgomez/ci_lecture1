package org.joda.time.lecture;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	private Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void testSum_positives() {
		assertEquals(4, calc.sum(2, 2));
	}
	
	@Test
	public void testSum_mult() {
		assertEquals(4, calc.mult(2, 2));
	}
	
	@Test(expected = RuntimeException.class)
	public void testSum_div_divByZero() {
		//Should throw exception
		assertEquals(0, calc.div(2, 0));
	}

}
