package com.project.TaskManagementV2.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaskManagementV2.Entity.User;
import com.project.TaskManagementV2.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	
	@Override
	public User getUserById(BigInteger id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User saveUser(User user) {
		userRepository.save(user);
		
		return user;
	}
	
	@Override
	public User updateUser(User user) {
		userRepository.save(user);
		
		return user;
	}

	
	@Override
	public void deleteUserById(BigInteger id) {
		User entity = userRepository.findById(id).get();
		userRepository.delete(entity);
		
	}

}
