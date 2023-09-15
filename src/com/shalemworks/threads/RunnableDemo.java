package com.shalemworks.threads;

public class RunnableDemo implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) {
		Runnable t1=new RunnableDemo();
		t1.run();
		for(int i=0;i<100;i++) {
			System.out.println("main thread");
		}
	}

}