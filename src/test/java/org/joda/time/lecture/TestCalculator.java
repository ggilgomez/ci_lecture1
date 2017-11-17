package org.joda.time.lecture;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testSum_positives() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.sum(2, 2));
	}
	
	@Test
	public void testSum_mult() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.mult(2, 2));
	}
	
	@Test(expected = RuntimeException.class)
	public void testSum_mult_nullPointer() {
		Calculator calc = new Calculator();
		Integer obj = null;
		assertEquals(4, calc.mult(2, obj));
	}

}
