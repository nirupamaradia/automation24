package com.core;

public class printpyramid {
	public static void main(String[] args) {
			int i,j,k;
			for(i=9;i;i>=0;i--)
			{
				for(k=0;k<10-i;k++)
				{
					System.out.print(" ");
				}
				for(j=0;j<=i;j++)
				{
			
			System.out.print("*");
				}
				System.out.println();
	}

}
}
