package com.project.TaskManagementV2.Repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaskManagementV2.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, BigInteger> {
	

}
