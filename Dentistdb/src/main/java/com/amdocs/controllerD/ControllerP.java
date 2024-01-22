package com.amdocs.controllerD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Appointments;
import com.amdocs.service.AppointmentsServImpl;

@RestController
public class ControllerP 
{
	@Autowired
	AppointmentsServImpl asi;

	@PostMapping("/addAppointment")
	public String add(@RequestBody Appointments app) 
	{
		asi.saveAppointment(app);
		return "Appointment booked Successfully";
	}

	@GetMapping("/getAppointments")
	public List<Appointments> getAllApps() 
	{

		return asi.getAllAppointments();
	}
	@DeleteMapping("/deleteAppointment/{pid}")
	public String cancelApp(int pid)
	{
		asi.cancelAppointment(pid);
		return "Patient data deleted successfully";
	}
}
