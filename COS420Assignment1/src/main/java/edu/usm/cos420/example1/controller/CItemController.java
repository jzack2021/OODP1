package edu.usm.cos420.example1.controller;

import java.util.List;

import edu.usm.cos420.example1.domain.CItem;
import edu.usm.cos420.example1.service.ExampleService;
import edu.usm.cos420.example1.service.impl.Example1Service;
import edu.usm.cos420.example1.view.impl.CItemView;
import edu.usm.cos420.example1.dao.domain.CItemDao;
import java.util.Scanner;
import edu.usm.cos420.example1.controller.CItemController;

/**
 *   A Controller class to execute user's menu choice.
 *     List of possible choices can be found at {@link edu.usm.cos420.example1.view.TextUI}
 *   
 */	 
public class CItemController {

	private ExampleService atMyService; 
	//private ExampleService atMyService2;
	private CItemView view;
	private CItemDao Dao;
	private CItem CItem;
	Scanner sc = new Scanner(System.in);
static String Item;
static String Customer;
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
		
	   
	    
	    atMyService.JSONTOLIST();
	  
	    
	    choice = view.readIntWithPrompt("Enter choice: ");
	  
	    
	    //      executeChoice(choice);

	    
	    if (choice == CItemView.ADDONE) {
	System.out.println("Customer Name?");
	Example1Service.setCust(sc);
	 atMyService.addACItem();
	    }
 
           else if (choice == CItemView.TWO)
           {
        	   Example1Service.setItem(sc);
        	   Example1Service.setCust(sc);//just filler to make the scanner give square values
        	   atMyService.addACItem();
	 
	  
	    }
	 
	    else if (choice == CItemView.THREE) {
	  
	    	 atMyService.JSONTOLIST();
	    	 
	    	atMyService.chooseItemforStockAdd(Item, sc);
	    	
	    	
	    	atMyService.addACItem();
	    	
	    
	    	
	    }
	   
	    else if (choice == CItemView.FOUR) {
	    	 atMyService.JSONTOLIST();
	    	System.out.println("Which Item?");
	    	atMyService.ShowItemsInFile();
	    	Item = sc.next();
	    	System.out.println("Item Ordered");
	    	
	    }
	    else if (choice == CItemView.FIVEL) {
	    	 atMyService.JSONTOLIST();
	    	 System.out.println("Which Customer?");
	    	  atMyService.ShowCustomersInFile();
	    	  Item = sc.next();
	    	  
	    }
	    else if (choice == CItemView.SIX) {
	    	atMyService.ShowItemsInFile();
		    
	    }
	    else if (choice == CItemView.SEVEN) {
	    	atMyService.ShowCustomersInFile();
		    
	    }
	    
	    else if (choice == CItemView.EXIT) {
	       	
		      System.out.println("Goodbye.");
	    }
}
}