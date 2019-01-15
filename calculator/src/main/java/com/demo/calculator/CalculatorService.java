package com.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	int sum( int a, int b) {
		return a + b;
	}
	
}
