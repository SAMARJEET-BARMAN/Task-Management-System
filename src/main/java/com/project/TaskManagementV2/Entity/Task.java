package com.project.TaskManagementV2.Entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	private BigInteger team_id;
	private BigInteger user_id;
	private BigInteger assigned_to;
	private String title;
	private String description;
	private String deadline;
	private int priority;
	private int status;
	private String created_at;
	private String updated_at;
	public Task(BigInteger id, BigInteger team_id, BigInteger user_id, BigInteger assigned_to, String title,
			String description, String deadline, int priority, int status, String created_at, String updated_at) {
		super();
		this.id = id;
		this.team_id = team_id;
		this.user_id = user_id;
		this.assigned_to = assigned_to;
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.priority = priority;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getTeam_id() {
		return team_id;
	}
	public void setTeam_id(BigInteger team_id) {
		this.team_id = team_id;
	}
	public BigInteger getUser_id() {
		return user_id;
	}
	public void setUser_id(BigInteger user_id) {
		this.user_id = user_id;
	}
	public BigInteger getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(BigInteger assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", team_id=" + team_id + ", user_id=" + user_id + ", assigned_to=" + assigned_to
				+ ", title=" + title + ", description=" + description + ", deadline=" + deadline + ", priority="
				+ priority + ", status=" + status + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
}
