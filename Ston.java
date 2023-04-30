package com.Sample;

public class Ston 
{

	int a,b;
	private static Ston ref = null;
	
	static int j;
	
	public Ston() // This is Constructor
	{
		a = 10;
		b = 20;
	}
	
	void setJ(int var)
	{
		j = var;
	}
	
	void showJ()
	{
		System.out.println("Value of J is " + j);
	}
	
	void changeData(int p, int q)
	{
		a = p;
		b = q;
	}
	
	void disp()
	{		
		System.out.println("Value of A is " + a + " and Value of B is " + b);
	}
	
	static Ston getObj() // This is Static block
	{
		if(ref == null)
		{
			ref = new Ston();
		}		
		return ref;
	}
	
	static void chkObj()
	{
		
		if(ref == null)
		{
			System.out.println("Object Not Initialised...");
		}
		else
		{
			System.out.println("Object Initialised...");
		}
	}
	
}