package com.project.TaskManagementV2.Controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.TaskManagementV2.Entity.User;
import com.project.TaskManagementV2.Service.UserService;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//Display the list of user from the Database
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}
	
	//Display the Details of particular UserID
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable BigInteger id) {
		return this.userService.getUserById(id);
	}
	
	//Add new user into the Database
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return this.userService.saveUser(user);
	}
	
	//Update user into the Database
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
	//Delete the particular user from the Database
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable BigInteger id){
		try {
			this.userService.deleteUserById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
