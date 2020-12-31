package com.java.methods;

public class NoReturnTypeWithParameter {
	
	public void add(int a,int b){
		int c = a+b;
		System.out.println("Addition of "+a+" + "+b+" = "+c);
			
	}
	public void sub(int a,int b){
		int c = a-b;
		System.out.println("Substraction of "+a+" - "+b+" = "+c);
			
	}
	public void mul(int a, int b){
		int c = a*b;
		System.out.println("Multiplication of "+a+" * "+b+" = "+c);
			
	}
	public void div(int a, int b){
		float c = (float) a/b;
		System.out.println("Division of "+a+" / "+b+" = "+c);
			
	}
}
