package edu.usm.cos420.example1.service.impl;

import java.io.ObjectOutputStream;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.usm.cos420.example1.dao.domain.CItemDao;
import edu.usm.cos420.example1.domain.CItem;
import edu.usm.cos420.example1.service.ExampleService;
import edu.usm.cos420.example1.view.impl.CItemView;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
  
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.io.*;
import java.util.ArrayList;
/**
 * 
 * The Example1 Service Layer Implementation is based a design pattern which
 * aims to organize the functionality of the application into logical units that
 * are typically layered on top of much of the low level functionality of the
 * application. This organization helps support service oriented architectures.
 *
 */
public class Example1Service implements ExampleService {

	CItemDao dao;
	static File file = new File("citem.json");
    List<String> stuff = new ArrayList<>();
	static Integer ItemStockAmount = 0;
	static String Item;
	static String Customer;
	static Long ItemID = 30L;
	Scanner in = new Scanner(System.in);
	
	/**
	 * Default Constructor creates a default CItemDao object
	 */

	public Example1Service()
	
	{
		
		this.dao = new CItemDao();
		JSONTOLIST();
		this.stuff = new ArrayList<>();
		
	}

	

	public static String setItem(Scanner sc) {
		System.out.flush();
	
	      System.out.println("Enter Item");
	      Item = sc.next();
	      Customer="x";
	    return Item;
		
	
	
		
		
	}
	public String setItem() {
		return Item;
	}
		
	
	public static String setCust(Scanner sc) {
		System.out.flush();

	      System.out.println("Enter Customer");
	      Customer = sc.next();
	    return Customer;
		
	
	
		
		
	}
	
	//public static String setItem (String Item) {
		
		
	//	return Item;
		
	//}


	/**
	 * Constructor with the DAO provided
	 * 
	 * @param dao
	 *            Data Access Object to use in the service
	 */
	
	
	
	
	public Example1Service(CItemDao dao) {
		
		this.dao = dao;
		
		
		
	}

//public String AddCustomer(Scanner sc) {
//	System.out.println("Name of Customer");
	
//	Customer = sc.next();
  //  return Customer;
	
//}
	
	

		
	
	
	


	/**
	 * 
	 * 
	 * Add a randomly generated CItem element to the repository
	 */
	

	
	public void addACItem() {
	
		
		Long ItemID = this.maxCItemId() + 1;
	//	int randomNum = 1 + (int) (Math.random() * 100000);
//	CItem anItem = new CItem(id, randomNum, "String with random number " + randomNum);
	//	dao.add(anItem);
		ItemStockAmount+=1;
		CItem anItem = new CItem(ItemID, ItemStockAmount, Item, Customer) ;
		dao.add(anItem);
		//Byte mymymy = ObjectOutputStream.TC_STRING;
		//System.out.println(mymymy);
		
		
		System.out.println("Item Added");
		
		
		
		
	
		
	}


	// Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));

    public void JSONTOLIST() {
		

		
		
		BufferedReader br = null;
    
		try {

			br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				stuff.add(line);
			}if (br != null) {
				br.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
		//System.out.print(stuff);
    }
	
	
    public void ShowItemsInFile() {
    	 for (int i = 4; i < stuff.size(); i+=6) {
 			
 	    	
 	    	System.out.print(stuff.get(i));}
 			
 	    }
    
    public void ShowCustomersInFile() {
   	 for (int i = 5; i < stuff.size(); i+=6) {
			
	    	
	    	System.out.print(stuff.get(i));}
			
	    }
   
    
	public String chooseItemforStockAdd(String Item, Scanner sc) {
		
		System.out.flush();
   
	    System.out.println("Add Stock +1 to which item");
	      
 for (int i = 4; i < stuff.size(); i+=6) {
			
	    	
	    	System.out.print(stuff.get(i));
			
	    }
		
	     Item = sc.next();
	     
	  	return Item;

		
	}
	public List<CItem> getAll()
	{
		return dao.list();
	}
	
	
	/**
	 * Calculate the maximum ID value of elements in the repository
	 * 
	 * @return the maximum id of a CItem in the repository
	 */

	public Long maxCItemId() {
		List<CItem> clist = dao.list();
		Long max = 0L;
		if (clist.isEmpty())
			return max;
		else {
		Iterator<CItem> iter = clist.iterator();
   		 max = iter.next().getId();
   		 while (iter.hasNext())
   		 {
   			 CItem anItem = iter.next();
   			 if (anItem.getId() > max)
   			     max = anItem.getId();
   		 }
   		 return max;	
		}
	}
}
