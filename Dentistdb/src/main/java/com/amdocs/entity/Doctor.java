package com.amdocs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor 
{
	@Id
	private int did;
	private String dname;
	private String dspec;
	
	public Doctor() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int did, String dname, String dspec) 
	{
		super();
		this.did = did;
		this.dname = dname;
		this.dspec = dspec;
	}

	public int getDid() 
	{
		return did;
	}

	public void setDid(int did) 
	{
		this.did = did;
	}

	public String getDname() 
	{
		return dname;
	}

	public void setDname(String dname) 
	{
		this.dname = dname;
	}

	public String getDspec() 
	{
		return dspec;
	}

	public void setDspec(String dspec) 
	{
		this.dspec = dspec;
	}

	@Override
	public String toString() 
	{
		return "Doctor [did=" + did + ", dname=" + dname + ", dspec=" + dspec + "]";
	}
	
	
}
