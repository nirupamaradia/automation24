package com.core;

import java.util.Scanner;

public class Laderif {
			public static void main(String[] args) {
				int rno,s1,s2,s3,total;
				double per;
				String sname;
				Scanner sc=new Scanner(System.in);
				System.out.println("eneter name of student : ");
				sname=sc.next();
				System.out.println("Enter roll number of student");
				rno=sc.nextInt();
				System.out.println("enter mmarks of subject 1 : ");
				s1=sc.nextInt();
				System.out.println("enetr marks of subject 2 : ");
				s2=sc.nextInt();
				System.out.println("enter marks of subject 3 : ");
			    s3=sc.nextInt();
			    
			    total=s1+s2+s3;
			    per=total/3;
			    
			    System.out.println("Student nam : "+sname);
			    System.out.println("Roll no : "+rno);
			    System.out.println("total : "+total);
			    System.out.println("percentage : "+per);
			    
				    if(per>=70)
				    {
				    	System.out.println("distinction");
				    }
				    else if(per>=48)
				    {
				    	System.out.println("pass class");
				    	
				    } else {
				    	System.out.println();
				    }
			    }

			}

