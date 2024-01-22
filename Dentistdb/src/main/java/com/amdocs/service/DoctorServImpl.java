package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Doctor;
import com.amdocs.repo.DoctorRepo;
@Service
public class DoctorServImpl implements DoctorServ
{
	@Autowired
	private DoctorRepo dr;

	@Override
	public List<Doctor> getAllDoctors() 
	{
		// TODO Auto-generated method stub
		return dr.findAll();
	}
	
}
