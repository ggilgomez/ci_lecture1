package org.joda.time.lecture;

import org.junit.Test;

import junit.framework.Assert;

public class TestCalculator {

	@Test
	public void testSum_positives() {
		Calculator calc = new Calculator();
		Assert.assertEquals(4, calc.sum(2, 2));
	}
	
	@Test
	public void testSum_mult() {
		Calculator calc = new Calculator();
		Assert.assertEquals(4, calc.mult(2, 2));
	}
}
