package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Patient;
import com.amdocs.repo.PatientRepo;
@Service
public class PatientServImpl implements PatientServ
{
	@Autowired
	public PatientRepo pr;

	@Override
	public void updatePatient(int pid, Patient p) 
	{
		// TODO Auto-generated method stub
		pr.deleteById(pid);
		pr.save(p);
	}

	@Override
	public List<Patient> getAllAPatients() 
	{
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void removePatient(int pid) 
	{
		// TODO Auto-generated method stub
		pr.deleteById(pid);
		
	}
	
}
