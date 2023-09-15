package com.shalemworks.threads;

public class Threads extends Thread {
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println("child thread");
			}
		}
		public static void main(String[] args) {
			Threads t1=new Threads();
			t1.start();
			for(int i=0;i<100;i++) {
				System.out.println("main thread");
			}
		}

	}


