package interfaceabstractdemo;

import java.util.Date;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date enginDate = new Date(1985,1,6);
		@SuppressWarnings("deprecation")
		Date umutDate = new Date(1997,8,8);
		@SuppressWarnings("deprecation")
		Date derinDate = new Date(2012,1,6);
		
		CustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.save(new Customer(1, "Engin", "Demiroğ", enginDate, "98765432194"));
		CustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(2, "Umut", "Taze", umutDate, "12345678916"));
		CustomerManager customerManager3 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager3.save(new Customer(3, "Derin", "Demiroğ", derinDate, "19827346550"));
	
		
	}

}
