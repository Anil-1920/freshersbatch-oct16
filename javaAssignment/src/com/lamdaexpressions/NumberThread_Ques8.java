package com.lamdaexpressions;

import java.util.List;

import java.util.ArrayList;

public class NumberThread_Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> Numbers=new ArrayList<>();
	        Numbers.add(1);
	        Numbers.add(2);
	        Numbers.add(3);
	        Numbers.add(4);
	        Numbers.add(5);

	        Thread t1=new Thread(()-> Numbers.forEach(i -> System.out.println(i)));
	        t1.start();

	}

}
