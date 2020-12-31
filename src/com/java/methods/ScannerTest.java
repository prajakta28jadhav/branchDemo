package com.java.methods;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println("Enter First Numer");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();

		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();

		System.out.println("Enter Second Numer");
		int secondNum = sc.nextInt();

		System.out.println("Name: " + name);
		System.out.println("==============================================");
		NoReturnTypeWithNoParameter obj = new NoReturnTypeWithNoParameter();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

		System.out.println("==============================================");
		NoReturnTypeWithParameter obj1 = new NoReturnTypeWithParameter();
		obj1.add(firstNum, secondNum);
		obj1.sub(firstNum, secondNum);
		obj1.mul(firstNum, secondNum);
		obj1.div(firstNum, secondNum);

		System.out.println("==============================================");
		ReturnTypeWithParameter obj2 = new ReturnTypeWithParameter();
		System.out.println("Addition of numbers :" + obj2.add(firstNum, secondNum));
		System.out.println("Sunstraction of numbers :" + obj2.sub(firstNum, secondNum));
		System.out.println("Multiplication of numbers :" + obj2.mul(firstNum, secondNum));
		System.out.println("Addition of numbers :" + obj2.div(firstNum, secondNum));

		System.out.println("*******=============================================");
		NoReturnTypeWithNoParameter obj3 = new NoReturnTypeWithNoParameter();
		obj3.add();
		obj3.sub();
		obj3.mul();
		obj3.div();

	}

}
