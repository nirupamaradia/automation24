package com.core;

import java.util.Scanner;

public void nestedif() {
	public static void main(String[] args)
	{
		  int a,b,c;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter A : ");
		  a=sc.nextInt();
		  System.out.println("Enter b : ");
		  b=sc.nextInt();
		  System.out.println("Enter c : ");
		  c=sc.nextInt();
		  if(a>b)
		  {
			if(a>c)
			{
			  System.out.println("A is max number");
		  }
		  else 
		  {
			  System.out.println("C Is max number");
		  }
			{
			if(b>c)
			{

				  System.out.println("b Is max number");
			}
			
			else
			{

				  System.out.println("C Is max number");
			}

		  
		  }
		  }
	
