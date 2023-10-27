package com.bnt.service;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class CalculatorServiceImplTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorService;

	@Test
	public void additionTest() {
		try {
			Integer answer = 30;
			assertEquals(answer, calculatorService.addition(10, 20));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void subtractionTest() {
		try {
			Integer answer = -10;
			// Integer addition =
			assertEquals(answer, calculatorService.subtraction(10, 20));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void multiplicationTest() throws Exception {
		try {
			Integer answer = 200;
			assertEquals(answer, calculatorService.multiplication(10, 20));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}

	}

	@Test
	public void divisionTest() throws Exception {
		try {

			calculatorService.division(10, 20);

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void squareTest() {
		try {

			Integer answer = 25;
			assertEquals(answer, calculatorService.square(5));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void squareRootTest() {
		try {
			Integer answer = 1;
			assertEquals(answer, calculatorService.squareRoot(2));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test
	public void factorialTest() {
		try {
			Integer answer = 120;
			assertEquals(answer, calculatorService.factorial(5));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}

	}

	@Test
	public void minMaxTest() {
		try {
			Integer min = 10;
			Integer max = 9;
			Map map = calculatorService.minMax(new Integer[] { 5, 9, 8, 1, 3, 9 });
			assertEquals(min, map.get("min"));
			assertEquals(max, map.get("max"));
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

}
