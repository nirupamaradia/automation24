package com.core;

import java.util.Scanner;

public class someofnnumber {
	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		i=sc.nextInt();
		while(i>0)
		{
			sum=sum+i;
			i=i-1;
			
		}
		System.out.println("sum :"+sum);
		
	}

}
