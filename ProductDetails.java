package com.simplilearn.javafsdphase1project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProductDetails {
	
	
    //main class
	public static void main(String[] args) {
	
		  // variable declaration
		  int choice ;
		  
		  //taken input from user
	      Scanner input = new Scanner(System.in);
	      
	      //loop to create menu driven problem containing all the operations 
	      do
	      {
	    	System.out.println("1. List of files");  
	    	System.out.println("2. Add a file"); 
	    	System.out.println("3. Delete a file"); 
	    	System.out.println("4. search a file"); 
	    	System.out.println("5. close the application"); 
	    	System.out.println("6. exit from the menu"); 
	    	System.out.println("");
	    	
	        System.out.println("Enter your choice of operation you want to perform on file from the above options ::");
	      
	        choice = input.nextInt();
	        
	        // Switch case is used for menu, surrounded by try and catch
	        
	        try 
	           {
	    	     switch(choice)
	    	     {
	    		  case 1 : 
	    			   FileOperation flist = new FileOperation();  //List of Files operation, FileOperation class object created to call the listOfFiles method
	    		       String listfilenames = flist.listOfFiles();
	    		       System.out.println(" " + listfilenames);
	        
	    	      break;
    
	    		  case 2: 
	    			  FileOperation fadd = new FileOperation();  //Add a file operation, FileOperation class object created to call the addAFile method
	    		      fadd.addAFile(); 
	    		      System.out.println();
	    	      break;
	    	   
	    		  case 3:
	    			  FileOperation fdelete = new FileOperation();  //delete a file operation, FileOperation class object created to call the deleteAFile method
	    		      fdelete.deleteAFile();
	    		      System.out.println(" ");
	    		  break;
	    		  
	    		  case 4:
	    			  FileOperation sear = new FileOperation();   //search a file operation, FileOperation class object created to call the searchAFile method
	    		      sear.searchAFile();
	    		      System.out.println("");
	    		  break;
	    		  
	    		  case 5:
	    			  
	    			  System.out.println("Application closed....Thank you for your time. Keep visiting!!!!!!");  // System.exit method is used to close the application
	    			  System.exit(choice);
	    			   
	    		  break;
	    		  
	    		  default:
	    			  
	    			  //to exit from the menu
	    			   System.out.println("You have successfully exited from the Menu..... Please select any of the options from the menu again if you want to perform any operation on the files..... ");
	    			   
	    		  break;
	    		  
	    	     }
	    	
	           }catch(Exception e) 
	        {
	 	  	      System.out.println("Exception occured...operation cannot be performed");
	 	  	      e.printStackTrace();
	 	  	    }
	 	  	      
	      
	      }
	      while(choice!=0);
	
	        
	      
	      
	    //create object of file class and providing the directory and filename which needs to be create.
	    File file = new File("/C:\\Java Full Stack\\Simplilearn-phase1/ProductPrice.txt");
	    
	    //file creation and surrounded by try and catch block
	      try
	      {
			if(file.createNewFile())
			{
				System.out.println("File " + file.getName() + " is created successfully");
			}
			
		  } 
	      
	      catch (IOException e) 
	        {
			  System.out.println("Exception occurred during file creation...");
		    }
	      
	      
	}
	
}
	
	      
		      
	    	  
	      
	     
	   
	     
	      

	
	      
	      
     



	   

