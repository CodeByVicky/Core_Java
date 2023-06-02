package com.Thread;

public class Thread1 extends Thread{

	@Override
	public void run()//running
	{
		String s=Thread.currentThread().getName();
		System.out.println(s+" is executing");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread1 t=new Thread1();//new
		t.setName("first thread");
		t.setPriority(1);
		t.start();//runnable
	//	t.start();//IllegalThreadStateException
		
		Thread1 t2=new Thread1();//new
		t2.setName("second thread");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		

	}

}
