package com.amdocs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer>
{

}