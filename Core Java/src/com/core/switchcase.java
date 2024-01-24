package com.core;

import java.util.Scanner;

public class switchcase {
 public static void main(String[] args) {
	int a,b,c,d;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A : ");
	a=sc.nextInt();
	System.out.print("enter b : ");
	b=sc.nextInt();
	System.out.println("1.Addition");
	System.out.println("2.subtraction");
	System.out.println("3.multiplication");
	System.out.println("4.division");
	System.out.print("enter your choice : ");
	d=sc.nextInt();
	switch(d)
	{
	case 1:
	c=a+b;
	System.out.println("addition : "+c);
	break;
	case 2:
		c=a-b;
		System.out.println("substraction: "+c);
		break;
	case 3:
		c=a*b;
		System.out.println("Multiplication : "+c);
		break;
	case 4:
		c=a/+b;
		System.out.println("Division : "+c);
		break;
	default:
	 System.out.println("Invalid choice");
	 break;
}
}
}