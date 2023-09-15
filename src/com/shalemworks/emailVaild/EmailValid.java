package com.shalemworks.emailVaild;
import java.util.*;
public class EmailValid {
    public static void main(String[] args) {
        // Define an array of email IDs
        String[] emailArray = {
            "shalem@mphasis.com",
            "naveen@mphasis.com",
            "kishore@mphasis.com",
            "balaji@mphasis.com",
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email ID to search: ");
        String searchEmail = sc.nextLine();
       // boolean found = false;
        int temp=0;
        for (int i = 0; i < emailArray.length; i++) {
        	if (searchEmail.equals(emailArray[i])) {
        		temp=1;
        		break;
        	}
       }
        if (temp==1) {
       	 System.out.println("Email ID found in the array.");
       }else {
       	System.out.println("Email ID not found in the array.");
       }
       	 
    }
}