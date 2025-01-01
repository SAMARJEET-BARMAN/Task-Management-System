package com.project.TaskManagementV2.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaskManagementV2.Entity.Task;
import com.project.TaskManagementV2.Repository.TaskRepository;



@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	
	@Override
	public Task getTaskById(BigInteger id) {
		return taskRepository.findById(id).get();
	}

	@Override
	public Task saveTask(Task Task) {
		taskRepository.save(Task);
		
		return Task;
	}
	
	@Override
	public Task updateTask(Task Task) {
		taskRepository.save(Task);
		
		return Task;
	}

	
	@Override
	public void deleteTaskById(BigInteger id) {
		Task entity = taskRepository.findById(id).get();
		taskRepository.delete(entity);
		
	}

}
