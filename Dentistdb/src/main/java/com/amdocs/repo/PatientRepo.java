package com.amdocs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>
{
	
}
