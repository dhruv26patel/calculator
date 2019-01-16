package com.demo.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Calculator Tests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTests {

	private CalculatorService  calculator = new CalculatorService();
	
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3));
	}

}

