package com.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
	@RequestMapping("/sum")
	public String sum(@RequestParam("a") Integer a,
					  @RequestParam("b") Integer b) {
		return String.valueOf(calculatorService.sum(a, b));
	}
	
}
