package com.amdocs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient 
{
	@Id
	private int pid;
	private String Prescription;
	private String Comment;
	
	public Patient() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPid() 
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getPrescription() 
	{
		return Prescription;
	}

	public void setPrescription(String prescription) 
	{
		Prescription = prescription;
	}

	public String getComment() 
	{
		return Comment;
	}

	public void setComment(String comment) 
	{
		Comment = comment;
	}

	public Patient(int pid, String prescription, String comment) 
	{
		super();
		this.pid = pid;
		Prescription = prescription;
		Comment = comment;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", Prescription=" + Prescription + ", Comment=" + Comment + "]";
	}
	
	
	
}
