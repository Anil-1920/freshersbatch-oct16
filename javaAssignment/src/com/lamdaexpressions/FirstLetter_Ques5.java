package com.lamdaexpressions;

import java.util.List;

import java.util.ArrayList;

public class FirstLetter_Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Names=new ArrayList<>();
        Names.add("Subrat");
        Names.add("Saroj");
        Names.add("Krishna");
        Names.add("Kedar");
        Names.add("Pravin");

        StringBuilder result=new StringBuilder();
        Names.forEach(s ->result.append(s.charAt(0)));
        System.out.println(result+" ");
        

	}

}
