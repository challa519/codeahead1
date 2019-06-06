package com.challa.codeahead1.thread;

public class AsynJob {

	public static void main(String[] args) {
		System.out.println("Main Thread");
		MyThread m1=new MyThread();
		Thread t1=new Thread(m1);
		t1.start();
		System.out.println("Main Thread Completed ");
		

	}

}
class MyThread implements Runnable {
	
	public void run() {
		try {
		System.out.println(Thread.currentThread().getName());
	    Thread.sleep(10000);
	    System.out.println("MyThread Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
