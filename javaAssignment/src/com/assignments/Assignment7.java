package com.assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new  Scanner(System.in);
		int[]a= {5,12,14,6,78,19,1,23,26,35,37,52,7,86,47};
		System.out.println("serch one number");
		int n= scn.nextInt();
		int j=1;
		for (int i=0;i<15;i++) {
			
			if (a[i]==n){
				System.out.println("Value is here");
				j=0;
			}
			
		}
		if(j==1)
		{
		 System.out.println("value is not here ");
		 
	}
	}

}
