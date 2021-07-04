package com.codingdojo.calculator;

public class Calculator {
	
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
	}

	public double getOperandOne() { //
		return operandOne;
	}

	public void setOperandOne(double operandOne) { //
		this.operandOne = operandOne;
	}

	public double getOperandTwo() { //
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) { //
		this.operandTwo = operandTwo;
	}

	public String getOperation() { //
		return operation;
	}

	public void setOperation(String operation) { //
		if(operation == "+" || operation == "-") {
		this.operation = operation;
		} else {
			System.err.println("Debe ingresar Suma o Resta para operar correctamente");
		}
	}

	public void getResult() { //
		 System.out.println("su resultado es: "+this.result);
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void performOperation() { //
		if(getOperation() == "+") {
			this.result = getOperandOne() + getOperandTwo(); 
		} else if (getOperation() == "-"){
			this.result = getOperandOne() - getOperandTwo(); 
		} else {
			System.err.println("Operación incorrecta");
		}
	}
}
