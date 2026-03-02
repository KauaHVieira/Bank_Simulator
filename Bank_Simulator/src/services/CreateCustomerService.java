package services;

import entities.Customer;

public class CreateCustomerService {
	
	public void createCustomer(String name, String email) {
		Customer customer = new Customer(name, email);
	}
}
