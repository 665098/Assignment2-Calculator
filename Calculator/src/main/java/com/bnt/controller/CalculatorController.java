package com.bnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.dto.CalculatorResponse;
import com.bnt.dto.MinMaxRequest;
import com.bnt.dto.MinMaxResponse;
import com.bnt.service.CalculatorService;

@RestController
@RequestMapping("calculatorapi/v1/")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("addition")
	public CalculatorResponse getAddition(@RequestParam(name = "number1") Integer num1,
			@RequestParam(name = "number2") Integer num2) {
		int answer = num1 + num2;
		String detail = num1 + " + " + num2 + " = " + answer;
		Integer addition = calculatorService.addition(num1, num2);
		return new CalculatorResponse(addition, detail);
	}

	@GetMapping("subtraction")
	public CalculatorResponse getSubtraction(@RequestParam(name = "number1") Integer num1,
			@RequestParam(name = "number2") Integer num2) {
		int answer = num1 + num2;
		Integer substraction = calculatorService.subtraction(num1, num2);
		String details = num1 + "-" + num2 + "=" + answer;
		return new CalculatorResponse(substraction, details);

	}

	@GetMapping("multiplication")
	public CalculatorResponse getMultiplication(@RequestParam(name = "number1") Integer num1,
			@RequestParam(name = "number2") Integer num2) {
		int answer = num1 * num2;
		Integer multiplication = calculatorService.multiplication(num1, num2);
		String details = num1 + "*" + num2 + "=" + answer;
		return new CalculatorResponse(multiplication, details);

	}

	@GetMapping("divsion")
	public CalculatorResponse getDivision(@RequestParam(name = "number1") Integer num1,
			@RequestParam(name = "number2") Integer num2) {
		int answer = num1 * num2;
		Integer division = calculatorService.multiplication(num1, num2);
		String details = num1 + "/" + num2 + "=" + answer;
		return new CalculatorResponse(division, details);

	}

	@GetMapping("square/{num}")
	public CalculatorResponse getSquare(@RequestParam(name = "number1") Integer num1) {
		Integer square = calculatorService.square(num1);
		String details = "square of " + num1 + "=" + square;
		return new CalculatorResponse(square, details);

	}

	@GetMapping("squareroot/{num}")
	public CalculatorResponse getSquareRoot(@RequestParam(name = "number1") Integer num1) {
		Integer squareRoot = calculatorService.squareRoot(num1);
		String details = "square root of " + num1 + "=" + squareRoot;
		return new CalculatorResponse(squareRoot, details);

	}

	@GetMapping("factorial/{num}")
	public CalculatorResponse getFactorial(@RequestParam(name = "number1") Integer num1) {
		Integer factorial = calculatorService.factorial(num1);
		String details = num1 + "=" + factorial;
		return new CalculatorResponse(factorial, details);

	}

	@PostMapping("minmax")
	public MinMaxResponse minMax(@RequestBody MinMaxRequest request) {
		int max = request.getNumbers().stream().max(Integer::compare).get();
		int min = request.getNumbers().stream().min(Integer::compare).get();
		MinMaxResponse minMaxResponse = new MinMaxResponse();
		minMaxResponse.setMax(max);
		minMaxResponse.setMin(min);
		return minMaxResponse;

	}

}
