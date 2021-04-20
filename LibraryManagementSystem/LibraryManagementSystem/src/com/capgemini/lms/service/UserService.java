package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Users;

public interface UserService {
	public int register(Users user);
	public Users loginValidate(String username,String password);
	public void cancelSubscription(int userid);
	public int payThePenalty(int userid, double amount);
	public List<Users> viewAllUsers();
	public int updateUserDetails(Users user);
	public int deleteUser(int id);
}
