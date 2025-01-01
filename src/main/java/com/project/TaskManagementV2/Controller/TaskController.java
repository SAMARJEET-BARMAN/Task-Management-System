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

import com.project.TaskManagementV2.Entity.Task;
import com.project.TaskManagementV2.Service.TaskService;



@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	//Display the list of Tasks from the Database
		@GetMapping("/tasks")
		public List<Task> getAlltasks() {
			return this.taskService.getAllTasks();
		}
		
		//Display the Details of particular TaskID
		@GetMapping("/tasks/{id}")
		public Task getTaskById(@PathVariable BigInteger id) {
			return this.taskService.getTaskById(id);
		}
		
		//Add new Task into the Database
		@PostMapping("/tasks")
		public Task saveTask(@RequestBody Task Task) {
			return this.taskService.saveTask(Task);
		}
		
		//Update Task into the Database
		@PutMapping("/tasks")
		public Task updateTask(@RequestBody Task Task) {
			return this.taskService.updateTask(Task);
		}
		
		//Delete the particular Task from the Database
		@DeleteMapping("/tasks/{id}")
		public ResponseEntity<HttpStatus> deleteTaskById(@PathVariable BigInteger id){
			try {
				this.taskService.deleteTaskById(id);
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
