package com.jsp.numberprogramming;

import java.util.Scanner;

public class NeonNumber {
	public static boolean isNeon(int n) {
		int square = n*n;
		int sum = 0;
		while(square != 0) {
			int lastdigit = square % 10 ;
			sum = sum + lastdigit ; 
			square = square / 10 ;
		}
		if ( sum == n ) {
			return true ;
		}else
		{
			return false ;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
	    System.out.println(isNeon(n));	

	}

}
