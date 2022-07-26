package com.user.account.service;

import java.util.List;

import com.user.account.entity.Address;

public interface AddressService {
	
	
 Address findZipcode(Integer zipcode); 	
 
 List<Address> findAllList();

 Address saveAddress(Address address);
}
