package com.amdocs.service;

import java.util.List;

import com.amdocs.entity.Patient;

public interface PatientServ 
{

	public List<Patient> getAllAPatients();

	public void removePatient(int pid);

	void updatePatient(int pid, Patient p);

}
