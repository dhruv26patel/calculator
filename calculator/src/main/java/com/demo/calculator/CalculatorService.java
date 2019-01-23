package com.demo.calculator;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

/**
 * Calculator Service.
 */

@Service
public class CalculatorService {
    @Cacheable("sum")
    public int sum(int a, int b) {
        return a + b;
    }
}
