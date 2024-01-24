package com.core;

import java.util.Scanner;

public class Arrayelement {
public static void main(String[] args) {
	int a[]=new int[5];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array Elements");
	for(i=0;i<a.length;i++)
	{
		System.out.print("enter "+i+" element: ");
		a[i]=sc.nextInt();
	}
	System.out.println("Array elements are");
	for(i=0;i<a.length;i++)
	{
		System.out.println("A["+i+"] = "+a[i]);
	}
}

}
