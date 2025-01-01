package com.project.TaskManagementV2.Service;


import java.math.BigInteger;
import java.util.List;

import com.project.TaskManagementV2.Entity.User;



public interface UserService {

	List<User> getAllUsers(); //Get all the Users Detail From the Database
	User saveUser(User user); //Add user into the Database
	User getUserById(BigInteger id); //Get the particular user id from the Database
	User updateUser(User user); //Update user into the Database
	void deleteUserById(BigInteger id); //Delete the particular user from the Database
}
