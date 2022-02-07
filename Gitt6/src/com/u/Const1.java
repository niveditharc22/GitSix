package com.u;

class Const1 
{
	Const1(char division)
	{
		division='c';
		System.out.println("division is "+division);
	}
	Const1(double balance)
	{
		balance=44.89d;
		System.out.println("balance is "+balance);
	}

     Const1(long salary)
     {
    	 salary=656000;
    	 System.out.println("Monthly salary is: "+salary);
     }
     
     public static void main(String args[]) 
     {
    	 Const1 obj=new Const1(23.2344d);
    	 Const1 obj1=new Const1('r');
    	 Const1 obj2=new Const1(890994);
     }
 }