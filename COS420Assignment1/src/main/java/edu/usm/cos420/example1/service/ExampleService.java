package edu.usm.cos420.example1.service;
import java.util.Scanner;
import java.util.List;

import edu.usm.cos420.example1.domain.CItem;
import java.util.Scanner;
/**
 * 
 *  The Example1 Service Interface is based a design pattern
 *      which aims to organize the functionality of the application into logical units 
 *      that are typically layered on top of much of the low level functionality of the 
 *      application. This organization helps support service oriented architectures. 
 *
 */
public interface ExampleService {
	
	/**
	 * Add a randomly generated CItem element to the repository
	 */
	public void JSONTOLIST();
	
	public String chooseItemforStockAdd(String Item, Scanner sc);
	
	public void ShowItemsInFile();
	
	
	public String setItem();
	
	
	  public void ShowCustomersInFile();
	
    public void addACItem();
	/**
	 * return the list of CItems from the repository
	 */
    public List<CItem> getAll();
    /**
     * Calculate the maximum ID value of elements in the repository     
     * @return the maximum id of a CItem in the repository
     */
	public Long maxCItemId();
	
}
