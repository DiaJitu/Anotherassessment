package com.amdocs.service;

import java.util.List;

import com.amdocs.entity.Appointments;


public interface AppointmentsServ 
{
	public Appointments saveAppointment(Appointments app);

	public List<Appointments> getAllAppointments();

	public void cancelAppointment(int aid);
}
