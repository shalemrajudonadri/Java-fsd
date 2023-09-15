package com.shalemworks.synchronization;

public class SyncDemo2 {

    public static void main(String args[]) 
    { 
    	SynchDemo1 snd = new SynchDemo1 (); 
    	SyncDemo3 S1 =  new SyncDemo3( " How Are You" , snd ); 
    	SyncDemo3 S2 = new SyncDemo3( " Good " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
		
	}


