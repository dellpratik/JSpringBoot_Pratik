package com.Sample;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class UseSton 
{

	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		
		// Code below is about behaviour of Singleton Class - only one object can be instantiated.
		
		Ston.chkObj();		
		Ston s1 = Ston.getObj();		
		Ston.chkObj();
		
		s1.disp();		
		s1.changeData(100, 200);
		s1.disp();
		
		Ston s2;
		s2 = Ston.getObj();
		
		if(s1.equals(s2))
		{
			System.out.println("Same Object !!!");
		}
		else
		{
			System.out.println("Different Object !!!");
		}
		
		s2.disp();
		
		// Code below is about behaviour of Static variables; 
		/*  
		Ston s1 = new Ston();
		s1.disp();
		
		s1.showJ();
		
		s1.setJ(500);
		
		s1.showJ();
		
		Ston s2 = new Ston();
		
		s2.showJ();
		s2.setJ(900);
		
		s2.showJ();
		s1.showJ();
		*/
	}
}
