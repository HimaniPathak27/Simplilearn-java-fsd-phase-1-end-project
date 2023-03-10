package com.simplilearn.javafsdphase1project;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//class created to perform all the operation on files
public class FileOperation {
	
	//listOfFiles Method creation
    public String listOfFiles()
    {
    	//Surrounded by try and catch
    	try 
        {
    	  //creating ArrayList of the file names
          List<String> filelist = new ArrayList<>();
          filelist.add("ProductId.txt");
          filelist.add("ProductName.txt");
          filelist.add("OrderDetails.txt");
          filelist.add("InventoryDetails.txt");
          filelist.add("PaymentInformation.txt");
          filelist.add("ProductPrice.txt");
    
          //method to sort the files in ascending order
          Collections.sort(filelist);
          
          //print the files
          System.out.println("The list of sorted files present in the directory are:: " + filelist);
         }
	     catch(Exception e)
         {
		 e.printStackTrace();
		 
         }
		return "";
    
        
    
    }   
  
    
    //addAFile method created to do the functionality of adding a file to existing directory
    public String addAFile()
    {   
    	
    	try
    	{
    	
    	// Taken input from user through Scanner class 
    	Scanner fileinput = new Scanner(System.in);
    	System.out.println(" Enter the file name which you want to add and the location path where you want to add file ");
    	
    	String filename = fileinput.nextLine();
    	
    	FileOutputStream fos = new FileOutputStream(filename, true);
    	
    	System.out.println(" Enter the content you want to write inside the file ");
    	
    	String content = fileinput.nextLine();
    	byte b[]= content.getBytes();
    	
    	//method to write the content into the file
    	fos.write(b);
    	
    	//method to close once write operation is complete
    	fos.close();
    	
		System.out.println(" File is added on the given location path and saved successfully. ");	
		
    	} 
    		
    	catch (Exception e) 
    		{
				System.out.println(" File cannot be added due to some exception occured....... ");
				e.printStackTrace();
				
			}
		return "";
			
    	
    		
    		
    	}
    	
    	
		
    


    //method to delete a file 
    public String deleteAFile() 
    {   
    	try
    	{
    		
        //String filedelete;	
    	//Scanner sc = new Scanner(System.in);
    	
    	//System.out.println("Enter the file name which you want to delete from the directory");
    	//filedelete = sc.nextLine();
  
                
    	//path in which the user want to delete a file and the file to be deleted
    		
        File filetobedelete = new File("/C:\\Java Full Stack\\Simplilearn-phase1/Test.txt");  //file to be delete  
        
        	if(filetobedelete.delete())                     //returns Boolean value  
    	{  
    	
    		System.out.println(" The file is successfully deleted");  
        }
        
   
    	else  
    	{  
    	       
    		System.out.println("something went wrong....getting error while deleting a file");  
    	}  
    	
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception occured......");
    	}
    	   
		return "";  
    	
    }
    
    //method to search a file from the ArrayList
    public String searchAFile()
    {
    	try
    	{
    	
        //variable declaration
    	String searchfile;	
    	
    	//taken input from user through Scanner class
    	Scanner search = new Scanner(System.in);
    	
    	System.out.println("Enter the file name you want to search in the directory");
    	searchfile = search.nextLine();
    	
    	List<String> filelist = new ArrayList<>();
    	
    	
        filelist.add("ProductId.txt");
        filelist.add("ProductName.txt");
        filelist.add("OrderDetails.txt");
        filelist.add("InventoryDetails.txt");
        filelist.add("PaymentInformation.txt");
        filelist.add("ProductPrice.txt");
        
        //loop to search a file and print it
    	for(int i=0; i<filelist.size(); i++)
    	{
    		if(filelist.contains(searchfile))
    		{
    	    System.out.println(" File is found ");
    		}
    		else 
    		{
    		System.out.println("file not found");
    		}
    		break;
    		
    	}
    	}
    	catch(Exception e)
    	{
    		System.out.println("File not found");
    		e.printStackTrace();
    	}
    	
    	
    	
		return "";
    	
    }



	
	
    
    }  
    



		
	

	
	
    


