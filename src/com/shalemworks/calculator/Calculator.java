package com.shalemworks.calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<=5;i++) {
			System.out.print("Enter first number: ");
			double f_num = sc.nextDouble();
			System.out.print("Enter Second  number: ");
			double s_num = sc.nextDouble();
			System.out.print(" enter an operator do you want to calculate (+,-,*,/,%): ");
			char oper = sc.next().charAt(0);
			switch(oper) {
			case'+' : System.out.println("The result is : " + (f_num+s_num));
					break;
			case'-' : System.out.println("The result is : " + (f_num-s_num));
					break;
			case'*' : System.out.println("The result is : " + (f_num*s_num));
					break;
			case'/' : System.out.println("The result is : " + (f_num/s_num));
					break;
			case'%' : System.out.println("The result is : " + (f_num%s_num));
					break;
			default : System.out.println(" Invalid Input ");
			}
		}
		
	}

}
