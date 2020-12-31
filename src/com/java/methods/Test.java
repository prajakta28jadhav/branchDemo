package com.java.methods;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("==============================================");
		NoReturnTypeWithNoParameter obj = new NoReturnTypeWithNoParameter();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

		System.out.println("==============================================");
		NoReturnTypeWithParameter obj1 = new NoReturnTypeWithParameter();
		obj1.add(20, 40);
		obj1.sub(20, 40);
		obj1.mul(20, 40);
		obj1.div(20, 40);

		System.out.println("==============================================");
		ReturnTypeWithParameter obj2 = new ReturnTypeWithParameter();
		System.out.println("Addition of numbers :" + obj2.add(20, 40));
		System.out.println("Sunstraction of numbers :" + obj2.sub(20, 40));
		System.out.println("Multiplication of numbers :" + obj2.mul(20, 40));
		System.out.println("Addition of numbers :" + obj2.div(20, 40));

		System.out.println("*******=============================================");
		NoReturnTypeWithNoParameter obj3 = new NoReturnTypeWithNoParameter();
		obj3.add();
		obj3.sub();
		obj3.mul();
		obj3.div();

	}

}
