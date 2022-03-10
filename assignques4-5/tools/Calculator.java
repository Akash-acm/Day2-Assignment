package org.demo.tools;

public class Calculator {
	
	public int a,b;
	public Calculator(int a, int b) {
		
		this.a=a;
		this.b=b;
		
	}
	public void add() {
		System.out.println(a+b);
	}
	public void substract() {
		System.out.println(a-b);
	}
	public void multiply() {
		System.out.println(a*b);
	}
	public void divide() {
		System.out.println(a/b);
	}

}
