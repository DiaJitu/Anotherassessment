package com.amdocs.controllerD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Patient;
import com.amdocs.service.PatientServImpl;

@RestController
public class ControllerD 
{
	@Autowired
	PatientServImpl psi;

	@PostMapping("/update/{pid}")
	public String changeP(@PathVariable int pid, @RequestBody Patient p) 
	{
		psi.updatePatient(pid, p);
		return "Patient Added Successfully";
	}

	@GetMapping("/getAll")
	public List<Patient> getAllPatients() 
	{

		return psi.getAllAPatients();
	}
	@DeleteMapping("/delete/{pid}")
	public String deletePatient(int pid)
	{
		psi.removePatient(pid);
		return "Patient data deleted successfully";
	}
}
