package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.UserAddress;
import com.capgemini.lms.exception.AddressNotFoundException;

public interface UserAddressDao {
	public int addUserAddress(UserAddress address);
	public int updateUserAddressDetails(UserAddress address) throws AddressNotFoundException;
	public int deleteUserAddress(int addressId) throws AddressNotFoundException;
	public UserAddress viewAddressByUserId(int userid) throws AddressNotFoundException;
	public List<UserAddress> viewUserAddressList();
}
