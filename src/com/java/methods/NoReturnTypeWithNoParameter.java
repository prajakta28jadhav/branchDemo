package com.java.methods;

public class NoReturnTypeWithNoParameter {
	int a= 50,b=60;
	public void add(){
		int c = a+b;
		System.out.println("Addition of "+a+" + "+b+" = "+c);
			
	}
	public void sub(){
		int c = a-b;
		System.out.println("Substraction of "+a+" - "+b+" = "+c);
			
	}
	public void mul(){
		int c = a*b;
		System.out.println("Multiplication of "+a+" * "+b+" = "+c);
			
	}
	public void div(){
		float c = (float)a/b;
		System.out.println("Division of "+a+" / "+b+" = "+c);
			
	}
}
