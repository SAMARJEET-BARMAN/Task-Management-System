package com.project.TaskManagementV2.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaskManagementV2.Entity.Team;
import com.project.TaskManagementV2.Repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	
	@Override
	public Team getTeamById(BigInteger id) {
		return teamRepository.findById(id).get();
	}

	@Override
	public Team saveTeam(Team team) {
		teamRepository.save(team);
		
		return team;
	}
	
	@Override
	public Team updateTeam(Team team) {
		teamRepository.save(team);
		
		return team;
	}

	
	@Override
	public void deleteTeamById(BigInteger id) {
		Team entity = teamRepository.findById(id).get();
		teamRepository.delete(entity);
		
	}

}
