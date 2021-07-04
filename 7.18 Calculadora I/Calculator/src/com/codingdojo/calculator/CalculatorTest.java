package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandTwo(5.2);
		calculator.performOperation();
		calculator.getResult();
		
		calculator.setOperandOne(6.5);
		calculator.setOperation("-");
		calculator.setOperandTwo(5.2);
		calculator.performOperation();
		calculator.getResult();
		
		calculator.setOperandOne(0.5);
		calculator.setOperation("*");
		calculator.setOperandTwo(5.2);
		calculator.performOperation();
		calculator.getResult();
	}
}
