package com.bnt.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public Integer addition(Integer num1, Integer num2) {
		return num1 + num2;
	}

	@Override
	public Integer subtraction(Integer num1, Integer num2) {
		return num1 - num2;
	}

	@Override
	public Integer multiplication(Integer num1, Integer num2) {

		return num1 * num2;
	}

	@Override
	public double division(Integer num1, Integer num2) throws Exception {
		double answer = 0;
		try {
			answer = Double.valueOf(num1) / Double.valueOf(num2);
		} catch (Exception e) {
			throw e;
		}
		return answer;
	}

	@Override
	public Integer square(Integer num1) {
		return num1 * num1;
	}

	@Override
	public Integer squareRoot(Integer num1) {
		return (int) Math.sqrt(num1);
	}

	@Override
	public Integer factorial(Integer num1) {
		int answer = 1;
		for (int i = 1; i <= num1; i++)
			answer *= i;
		return answer;

	}

	@Override
	public Map minMax(Integer[] numbers) {
		Map<String, Integer> minMax = new HashMap<>();
		List<Integer> numList = Arrays.asList();
		Optional<Integer> max = numList.stream().max(Comparator.naturalOrder());
		Optional<Integer> min = numList.stream().min(Comparator.naturalOrder());
		minMax.put("min", min.get());
		minMax.put("max", max.get());
		return minMax;
	}

}
