package com.accolite.mini_au;

public class Caller {
	public static void main(String [] args)
	{
		Even_Odd eo = new Even_Odd();
		MyThread1 t1 = new MyThread1(eo);
		MyThread2 t2 = new MyThread2(eo);
		t1.start();
		t2.start();
	}
}
