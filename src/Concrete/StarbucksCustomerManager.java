package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;


public class StarbucksCustomerManager extends CustomerManager {
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager() {
		super();
	}

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to DB : " + customer.getFirstName());
		}else {
			System.out.println("Customer is not a valid person");
		}
		
	}
	

}
