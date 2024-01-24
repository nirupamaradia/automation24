package com.core;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
			
		}
		System.out.println("sum :"+sum);
		
	}

}
