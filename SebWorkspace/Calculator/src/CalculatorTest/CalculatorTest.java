package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	
	
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		
		assertEquals("No successful results", calc.add(5,5,10), "5+5=10");
		assertEquals("No successful results", calc.add(10,15,5),"10+5=15");
		assertEquals("No successful results", calc.add(15,5,10),"5+10=15");
		assertEquals("No ssuccessful results", calc.add(1,5,1), "numbers not valid");
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();

		assertEquals("No successful results", calc.subtractA(15,5,10), "15-5=10");


	}
	
	@Test
	public void subtractTest2() {
		Calculator calc = new Calculator();
		
		assertEquals("No successful results", calc.subtractB(15,5,10), "15-10=5");
		
	}

}
