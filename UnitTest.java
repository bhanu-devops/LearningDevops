package com.rms.test;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

public class UnitTest extends Calculator {
	double num1;
	double num2;
	String operation;

	@Before
	public void initializeParameters() {

		Scanner input = new Scanner(System.in);

		System.out.println("please enter the first number");
		num1 = input.nextDouble();

		System.out.println("please enter the second number");
		num2 = input.nextDouble();

		Scanner op = new Scanner(System.in);

		System.out.println("Please enter operation");
		operation = op.next();
		

	}

	@Test
	public void addTest() {
		if(operation.equals("+"))
        {
            //System.out.println("your answer is" + (num1 + num2));
        	System.out.println("Add value is : "+ add(num1,num2));
        	
        }
		if(operation.equals("-"))
        {
        	System.out.println("Substract value is : "+ substract(num1,num2));
        }if(operation.equals("*"))
        {
        	System.out.println("Multiply value is : "+ multiply(num1,num2));
        }
        if(operation.equals("/"))
        {
        	System.out.println("Divide value is : "+ divide(num1,num2));
        }
		
	}
	
}
