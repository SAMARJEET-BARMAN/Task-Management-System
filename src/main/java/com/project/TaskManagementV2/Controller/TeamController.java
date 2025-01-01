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

import com.project.TaskManagementV2.Entity.Team;
import com.project.TaskManagementV2.Service.TeamService;



@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
		//Display the list of Teams from the Database
		@GetMapping("/teams")
		public List<Team> getAllUsers() {
			return this.teamService.getAllTeams();
		}
		
		//Display the Details of particular TeamID
		@GetMapping("/teams/{id}")
		public Team getTeamById(@PathVariable BigInteger id) {
			return this.teamService.getTeamById(id);
		}
		
		//Add new Team into the Database
		@PostMapping("/teams")
		public Team saveUser(@RequestBody Team team) {
			return this.teamService.saveTeam(team);
		}
		
		//Update Team into the Database
		@PutMapping("/teams")
		public Team updateTeam(@RequestBody Team team) {
			return this.teamService.updateTeam(team);
		}
		
		//Delete the particular Team from the Database
		@DeleteMapping("/teams/{id}")
		public ResponseEntity<HttpStatus> deleteTeamById(@PathVariable BigInteger id){
			try {
				this.teamService.deleteTeamById(id);
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
