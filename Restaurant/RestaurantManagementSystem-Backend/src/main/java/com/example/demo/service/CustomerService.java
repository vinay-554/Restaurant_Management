package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);//create

	public List<Customer> findALL();//view all

	public void updateUser(Customer customer); //update

	public void deleteById(long id);//delete

	Customer findByUsername(String username);
	Customer getCustomerByUsername(String username);

	public Optional<Customer> getUserByName(String username);
	
	public Optional<Customer> findUserById(long id);

}
