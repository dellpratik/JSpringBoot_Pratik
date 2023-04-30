package com.Sample;

public class Sample_1 
{
	public static void main(String args[])
	{
		System.out.println("This is Sample_1");
		
		Sample_2 s_2;
		s_2 = new Sample_2();
		
		s_2.setA(10);
		s_2.setB(20);
		
		s_2.calculate();
		
		s_2.a = 20;
		s_2.b = 300;
		
		s_2.calculate();
		
		Sample_2.disp();
	}
}
