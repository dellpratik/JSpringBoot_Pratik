package com.Sample;

public class Sample_2 
{
	int a,b;
	
	private static int x,y;
	
	static Sample_2 setXandY()
	{
		
	}
	
	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public int getB() 
	{
		return b;
	}

	public void setB(int b) 
	{
		this.b = b;
	}
	
	public void calculate()
	{
		int res;
		
		res = this.a + this.b;
		
		System.out.println("Result Is:===>" + res);
		
	}
	
	public static void disp()
	{
		//System.out.println("Value of A is " + x + " and Value of B is " + y);
		System.out.println("This is Static Function");
	}
}
