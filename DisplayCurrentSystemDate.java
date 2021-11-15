package com.jsp.servletapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayCurrentSystemDate 
{
	public static void main(String[] args) 
	{
		Date date = new Date(); //(it gives the o/p as day mnth date time and year).
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:m:s");
		
		String newdate=sdf.format(date);
		System.out.println("date is :"+date);
		
		System.out.println("-------------------------------------------");
		System.out.println("system date = "+newdate);
		
		System.out.println("--------------------------------");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("h:m:s");
		String time =sdf2.format(date);
		System.out.println("time is :"+time);
	}
}
