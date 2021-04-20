package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.UserAddress;

public interface UserAddressService {
	public int addUserAddress(UserAddress address);
	public int updateUserAddressDetails(UserAddress address);
	public int deleteUserAddress(int addressId);
	public UserAddress viewAddressByUserId(int userid);
	public List<UserAddress> viewUserAddressList();
}
