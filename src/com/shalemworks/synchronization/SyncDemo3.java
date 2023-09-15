package com.shalemworks.synchronization;

public class SyncDemo3 extends Thread {
	private String msg; 
    private Thread t; 
    SynchDemo1 sender; 
    SyncDemo3(String m,  SynchDemo1 obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
}