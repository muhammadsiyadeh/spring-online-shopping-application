package com.era.shoppingbackend.dao;

import java.util.List;

import com.era.shoppingbackend.dto.Address;
import com.era.shoppingbackend.dto.Cart;
import com.era.shoppingbackend.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}
