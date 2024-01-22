package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Appointments;
import com.amdocs.repo.AppointmentsRepo;


@Service
public class AppointmentsServImpl implements AppointmentsServ
{
	@Autowired
	private AppointmentsRepo ar;

	@Override
	public Appointments saveAppointment(Appointments app) 
	{
		// TODO Auto-generated method stub
		return ((CrudRepository<Appointments, Integer>) ar).save(app);
	}

	@Override
	public List<Appointments> getAllAppointments() 
	{
		// TODO Auto-generated method stub
		return ((ListCrudRepository<Appointments, Integer>) ar).findAll();
	}

	@Override
	public void cancelAppointment(int id) 
	{
		((CrudRepository<Appointments, Integer>) ar).deleteById(id);
		
	}
	
}