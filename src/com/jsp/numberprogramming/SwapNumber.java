package com.jsp.numberprogramming;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		//Swap the number using third variable
		int temp = a;
		a = b;
		b = temp;
	    
		System.out.println("a="+a);
		System.out.println("b="+b);
	    

	}

}
