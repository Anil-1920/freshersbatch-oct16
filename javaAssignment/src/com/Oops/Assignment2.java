package com.Oops;
class Employee
{
	  void Salary()
	  {
		  System.out.println("salary day");
	  }
}
  
class Manager extends Employee
{
   void Salary()
{
	System.out.println("got salary");
}
   
 class Labour extends Employee
 {
	 void Salary()
	 {
		 System.out.println("increase salary");
	 }
 }

	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.Salary();
	}

}
