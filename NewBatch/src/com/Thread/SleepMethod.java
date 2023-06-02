package com.Thread;

public class SleepMethod implements Runnable{
	@Override
	public void run() {
		
		for(int i=1;i<=3;i++)
		{
		String s=Thread.currentThread().getName();
		System.out.println(s);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	

	public static void main(String[] args) {
		
		
		SleepMethod  s=new SleepMethod ();
		
		Thread t=new Thread(s,"Classical music playing");
		
		t.start();
		
		Thread t2=new Thread(s,"Jazz music playing");
		t2.start();
	}

	

}
