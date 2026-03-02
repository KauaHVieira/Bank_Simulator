package services;

import entities.Customer;

public class CustomerService {
	
	public Customer createCustomer(String name, String email) {
		return new Customer(name, email);
	}
}
