package com.shalemworks.files;
import java.io.*;
import java.util.Scanner;
public class Files {
	
	public static void main(String[] args) throws IOException{
		File file = new File ("C:\\Users\\biswa\\eclipse-workspace\\FsdProjects\\src\\com\\shalemworks\\files\\Demo.txt");
		System.out.println(file.createNewFile());
		System.out.println(file.delete());
		System.out.println(" successfully Deleted");
		
		System.out.println(file.createNewFile());
		
		FileWriter addData= new FileWriter ("C:\\Users\\biswa\\eclipse-workspace\\FsdProjects\\src\\com\\shalemworks\\files\\Demo.txt");
		addData.write(" This is written in Demo txt");
		addData.close();
		System.out.println("Successfully updated");
		File myReader= new File ("C:\\Users\\biswa\\eclipse-workspace\\FsdProjects\\src\\com\\shalemworks\\files\\Demo.txt");
		Scanner sc = new Scanner(myReader);
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
			
		}
		BufferedWriter buffWriter = null;
		String myData= " \nI want to append file";
		try 
		{
			buffWriter = new BufferedWriter (new FileWriter(new File ("C:\\Users\\biswa\\eclipse-workspace\\FsdProjects\\src\\com\\shalemworks\\files\\Demo.txt"),true));
			buffWriter.write(myData);
			System.out.println(" Append done");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(" File not Found");
		}
		catch(IOException e)
		{
			System.out.println(" I/O Error");
		}
		finally
		{
			try {
				if(buffWriter != null);
				{
					buffWriter.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(" I/O Error");
			}
		}
	}
}
