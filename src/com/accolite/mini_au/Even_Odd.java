package com.accolite.mini_au;

public class Even_Odd{
	int c=1;
	public synchronized void odd()
	{
		System.out.println(c);
		c++;
	}
	
	public synchronized void even()
	{
		System.out.println(c);
		c++;
	}
}
