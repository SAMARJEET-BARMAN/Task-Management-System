package com.project.TaskManagementV2.Service;

import java.math.BigInteger;
import java.util.List;

import com.project.TaskManagementV2.Entity.Team;


public interface TeamService {

	List<Team> getAllTeams(); //Get all the Teams Detail From the Database
	Team saveTeam(Team team); //Add Teams into the Database
	Team getTeamById(BigInteger id); //Get the particular Teams id from the Database
	Team updateTeam(Team team); //Update Teams into the Database
	void deleteTeamById(BigInteger id); //Delete the particular Teams from the Database
}
