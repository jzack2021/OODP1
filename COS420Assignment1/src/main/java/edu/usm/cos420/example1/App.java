package edu.usm.cos420.example1;

import edu.usm.cos420.example1.controller.CItemController;
import edu.usm.cos420.example1.dao.GenericDao;
import edu.usm.cos420.example1.dao.JsonDao;
import edu.usm.cos420.example1.domain.CItem;
import edu.usm.cos420.example1.service.ExampleService;
import edu.usm.cos420.example1.service.impl.Example1Service;
import edu.usm.cos420.example1.view.impl.CItemView;

/**
 * Top level application class that coordinates the calls to view and Controller
 *
 */
public class App
{
    /**
     * Entry point for application : calls {@link #provideCItemAccess()}
     * @param args  main program arguments, currently not used
     */
	public static void main( String[] args )
    {
		ExampleService service = new Example1Service();
		CItemView citemView = new CItemView();
	//	CItem hey4 = new CItem();
	//	CItem hey2 = new CItem(23, "yo");
	//	CItemController hey3 = new CItemController(hey2);
		CItemController controller = new CItemController(citemView, service);		
	//	controller.provideCItemAccess();
	controller.executeChoice(1);
	
	
	

			
		}
}
