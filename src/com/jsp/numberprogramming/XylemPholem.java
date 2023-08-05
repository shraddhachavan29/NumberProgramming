package com.jsp.numberprogramming;

import java.util.Scanner;

public class XylemPholem {

	public static String isXylem(int n ) {
		int temp= n;
		int count1 = 0;
		int count2 = 0;
		int sum1 = 0;
		int sum2 = 0;	
		// to count number
		while(n > 0) {
			n = n % 10 ;
			count1 ++ ;
		}	
		while(temp > 0) {
			int lastdigit  = temp % 10 ;
			count2 ++ ;
		}
		// to perform sum operation 
		while(temp > 0) {
			int lastdigit = temp % 10 ;
			count2 ++;
		
		if (count2 == 1 || count2 == count1) {
			sum1 = sum1 + lastdigit ;
		} else {
			sum2 = sum2 + lastdigit ;
		}
		temp = temp / 10;
	}
	if (sum1 == sum2) {
		return "It is a Xylem Number" ;
	}else
	{
		return "It is a Pholem Number" ;
		}
}
    public static void main(String[] args) {
    System.out.println(isXylem(1245));	//13338
    }
	}


