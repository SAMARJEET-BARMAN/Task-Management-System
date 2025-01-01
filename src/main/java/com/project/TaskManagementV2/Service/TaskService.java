package com.project.TaskManagementV2.Service;

import java.math.BigInteger;
import java.util.List;

import com.project.TaskManagementV2.Entity.Task;


public interface TaskService {
	
	List<Task> getAllTasks(); //Get all the Tasks Detail From the Database
	Task saveTask(Task Task); //Add Tasks into the Database
	Task getTaskById(BigInteger id); //Get the particular Tasks id from the Database
	Task updateTask(Task Task); //Update Tasks into the Database
	void deleteTaskById(BigInteger id); //Delete the particular Tasks from the Database
}
