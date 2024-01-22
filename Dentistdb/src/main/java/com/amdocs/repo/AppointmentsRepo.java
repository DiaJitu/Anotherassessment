package com.amdocs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.entity.Appointments;

@Repository
public interface AppointmentsRepo extends JpaRepository<Appointments, Integer>  
{
	
}
