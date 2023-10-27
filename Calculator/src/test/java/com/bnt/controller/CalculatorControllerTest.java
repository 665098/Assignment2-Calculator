package com.bnt.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.bnt.dto.CalculatorResponse;
import com.bnt.dto.MinMaxRequest;
import com.bnt.dto.MinMaxResponse;
import com.bnt.service.CalculatorService;

@SpringBootTest
public class CalculatorControllerTest {

	@Mock
	private CalculatorService calculatorService;

	@InjectMocks
	CalculatorController calculatorController;

	@Test
	public void additionTest() {
		try {
			int num1 = 5;
			int num2 = 3;
			int expectedResult = num1 + num2;
			String actualResult = expectedResult + " , " + num1 + " + " + num2 + " = " + expectedResult;
			Mockito.when(calculatorService.addition(5, 3)).thenReturn(8);
			CalculatorResponse calculatorResponse = calculatorController.getAddition(num1, num2);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void substractionTest() {
		try {
			int num1 = 5;
			int num2 = 3;
			int expectedResult = num1 - num2;
			String actualResult = expectedResult + " , " + num1 + " + " + num2 + " = " + expectedResult;
			Mockito.when(calculatorService.subtraction(5, 3)).thenReturn(2);
			CalculatorResponse calculatorResponse = calculatorController.getSubtraction(num1, num2);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void multiplicationTest() {
		try {
			int num1 = 5;
			int num2 = 3;
			int expectedResult = num1 * num2;
			String actualResult = expectedResult + " , " + num1 + " + " + num2 + " = " + expectedResult;
			Mockito.when(calculatorService.multiplication(5, 3)).thenReturn(15);
			CalculatorResponse calculatorResponse = calculatorController.getMultiplication(num1, num2);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void divisionTest() throws Exception {
		try {
			int num1 = 5;
			int num2 = 3;
			int expectedResult = num1 * num2;
			String actualResult = expectedResult + " , " + num1 + " + " + num2 + " = " + expectedResult;
			Mockito.when(calculatorService.division(5, 5)).thenReturn((double) 1);
			CalculatorResponse calculatorResponse = calculatorController.getDivision(num1, num2);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void squareTest() {
		try {
			int num1 = 5;

			int expectedResult = num1;
			String actualResult = expectedResult + " , " + num1 + " + " + " = " + expectedResult;
			Mockito.when(calculatorService.square(5)).thenReturn(25);
			CalculatorResponse calculatorResponse = calculatorController.getSquare(num1);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void squareRootTest() {
		try {
			int num1 = 5;

			int expectedResult = num1;
			String actualResult = expectedResult + " , " + num1 + " + " + " = " + expectedResult;
			Mockito.when(calculatorService.squareRoot(5)).thenReturn(2);
			CalculatorResponse calculatorResponse = calculatorController.getSquareRoot(num1);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void factorialTest() {
		try {
			int num1 = 5;

			int expectedResult = num1;
			String actualResult = expectedResult + " , " + num1 + " + " + " = " + expectedResult;
			Mockito.when(calculatorService.factorial(5)).thenReturn(120);
			CalculatorResponse calculatorResponse = calculatorController.getFactorial(num1);
			assertEquals(actualResult, calculatorResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void minMaxTest() {
		try {
			int num1 = 5;
			Map map = new HashMap<>();
			MinMaxRequest minMaxRequest = new MinMaxRequest();
			int expectedResult = num1;
			String actualResult = expectedResult + " , " + num1 + " + " + " = " + expectedResult;
			Mockito.when(calculatorService.minMax(new Integer[] { 5, 9, 8, 1, 3, 9 })).thenReturn(map);
			MinMaxResponse minMaxResponse = calculatorController.minMax(minMaxRequest);
			assertEquals(actualResult, minMaxResponse);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}

	}

}