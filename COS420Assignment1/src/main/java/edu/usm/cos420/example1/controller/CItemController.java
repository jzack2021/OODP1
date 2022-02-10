package edu.usm.cos420.example1.controller;

import edu.usm.cos420.example1.dao.GenericDao;

import edu.usm.cos420.example1.dao.JsonDao;
import edu.usm.cos420.example1.dao.domain.CItemDao;
import edu.usm.cos420.example1.domain.CItem;
import edu.usm.cos420.example1.service.ExampleService;
import edu.usm.cos420.example1.service.impl.Example1Service;
import edu.usm.cos420.example1.service.impl.let;
import edu.usm.cos420.example1.view.impl.CItemView;
import java.util.Scanner;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.*;
/**
 *   A Controller class to execute user's menu choice.
 *     List of possible choices can be found at {@link edu.usm.cos420.example1.view.TextUI}
 *   
 */	 
public class CItemController {

	private ExampleService atMyService; 
	private CItemView view;
	private CItemDao Dao;
	private CItem CItem;
	Scanner sc = new Scanner(System.in);
static String Item;
static Integer ItemNumber;
	static Long g;
	String fname;
	//File f = new File(fname);
	/**
	 * Constructor : pass in a service class which can provide access to cItem operations. 
	 * @param view 
	 * @param service
	 */
	 
    
	public CItemController(CItemView view, ExampleService service)
	{
		this.view = view;
		this.atMyService = service;
		
	}

	public CItemController(CItemDao Dao) {
		this.Dao = Dao;
	}
	public CItemController(CItem CItem) {
		
		this.CItem=CItem;
	}
	
	
	
	/**
	 * Allow the user to access the citem collection
	 * 
	 */
  //  public void provideCItemAccess()
  //  {
    //    int choice = CItemView.NO_CHOICE;
  //      while (choice != CItemView.EXIT) {
   //       view.displayMenu();
      
    //      choice = view.readIntWithPrompt("Enter choice: ");
    //      executeChoice(choice);
    //    }  	
  //  }

	/**
	 *   Performs the branching logic to call appropriate functions to satisfy user choice
	 *   @param choice represents the user selection of action they want accomplished. 
 	 */
	public void executeChoice (int choice) {
	    System.out.println();
	    view.displayMenu();
	    choice = view.readIntWithPrompt("Enter choice: ");
	    //      executeChoice(choice);
	    if (choice == CItemView.TWO)
	    {
	  
	    	
	    	
	 //   	System.out.print("Item");
	    	
	//    	Item=sc.nextLine();
	    	
	   // 	 edu.usm.cos420.example1.service.impl.Example1Service.setItem(Item);
	    	
	    	
	   
	 // ObjectOutputStream.nullOutputStream();
	 
	 
	  
	     
	     
	//       System.out.println("Item Number");
	      
	      
	//     ItemNumber = sc.nextInt();
	      
	     
	   
	 
	    
	    	  
	  Example1Service.setItem(sc);
	      
	     Example1Service.setCust(sc);
	      
	
		
			
			
		
	      


	  
	    //ystem.out.print("item added");
	    
	    	
	     atMyService.getAll();
	     System.out.println(atMyService.getAll());
	 
	    	atMyService.addACItem();
	   
	    //	atMyService.maxCItemId();
	      //tMyService.determineNumberOfObjectsInStream();
	     //Dao.list();
	   // 	System.out.println(atMyService.maxCItemId().MAX_VALUE);
     
	   
	   
	   	 
	   	  

	 
	   
	   	    
	   	   
	    }
	    else if (choice == CItemView.EXIT)
	      System.out.println("Goodbye.");
	    else if (choice == CItemView.THREE) {
	  
	    	
	    	Example1Service.JSONTOLIST();
	    	
	    	
	    
	    	
	    
	    	
	    }
	    else if (choice == CItemView.ADDONE) {
	    	Example1Service.setCust(sc);
	    	atMyService.addACItem();
	    }
	    else if (choice == CItemView.FOUR) {
	    	Example1Service.JSONTOLIST();
	    	
	    }
	    }
	  }
	  

