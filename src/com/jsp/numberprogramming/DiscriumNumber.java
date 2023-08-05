package com.jsp.numberprogramming;

import java.util.Scanner;

public class DiscriumNumber {
	public static boolean isDiscrium(int n) {
		int count = 0 ;
		int sum = 0 ;
		int temp = n ;
		
        while (temp>0) {
        	temp = temp / 10 ;
        	count++;
        }
        
      temp = n;
        while(temp > 0) {
        	int lastdigit = temp % 10 ;
        	int pro = 1;
        	
        	for ( int i=1;i<=count;i++) {
        		pro = pro*lastdigit;
        	}
        	count--;
        	sum = sum+pro;
        	temp = temp/10;
        	}
        if (sum == n) {
        	return true;
        }else
        {
        	return false ;
        }
        }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
	    System.out.println(isDiscrium(n));	

	}

}
