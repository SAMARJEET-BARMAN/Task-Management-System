package com.project.TaskManagementV2.Repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TaskManagementV2.Entity.Task;


public interface TaskRepository extends JpaRepository<Task, BigInteger> {

}
