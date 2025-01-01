package com.project.TaskManagementV2.Repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TaskManagementV2.Entity.Team;


public interface TeamRepository extends JpaRepository<Team, BigInteger> {

}
