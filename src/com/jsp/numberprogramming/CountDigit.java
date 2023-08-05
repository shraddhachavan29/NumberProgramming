package com.jsp.numberprogramming;
import java.util.Scanner;
public class CountDigit {
	public static int  Countdigit( int n ) {
		int count = 0 ;
		while (n > 0) {
		n = n / 10 ;
		count++ ;
	}
		return count ;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Numbers : ");
		int n = sc.nextInt();
		int res = Countdigit(n);
		System.out.println("There are "+res+ "Digits"+"in"+n);
	}
}
