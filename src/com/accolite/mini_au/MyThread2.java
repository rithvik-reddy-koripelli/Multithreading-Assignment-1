package com.accolite.mini_au;

public class MyThread2 extends Thread{
	Even_Odd eo ;
	public MyThread2(Even_Odd eo) {
		this.eo = eo;
	}
	public void run()
	{
		for(int i=0;i<50;i++)
			eo.even();
	}
}
