package test;

import java.time.LocalDate;


import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setFirstName("Aaaa");
		customer.setLastName("Bbbb");
		customer.setNationalityId("11111111111");
		customer.setDateOfBirth(LocalDate.of(2341, 12, 12));
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

		System.out.println("deneme");
	}

}
