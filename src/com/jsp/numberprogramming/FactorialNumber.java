package com.jsp.numberprogramming;

import java.util.Scanner;

public class FactorialNumber {
	public static int isFactorial(int n) {
		int fact = 1 ;
		while (n > 0) {
			fact = fact * n ;
			n -- ;
		}
		return fact ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
	    System.out.println(isFactorial(n));	

	}

}
