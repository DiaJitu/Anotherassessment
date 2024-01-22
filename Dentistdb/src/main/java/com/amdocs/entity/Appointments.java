package com.amdocs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointments 
{
	@Id
	private int aid;
	private int pid;
	private int did;
	private String adate;
	private String atime;
	
	public Appointments() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(int aid, int pid, int did, String adate, String atime) 
	{
		super();
		this.aid = aid;
		this.pid = pid;
		this.did = did;
		this.adate = adate;
		this.atime = atime;
	}

	public int getAid() 
	{
		return aid;
	}
	
	public void setAid(int aid) 
	{
		this.aid = aid;
	}

	public int getPid() 
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) 
	{
		this.did = did;
	}

	public String getAdate() 
	{
		return adate;
	}

	public void setAdate(String adate) 
	{
		this.adate = adate;
	}

	public String getAtime() 
	{
		return atime;
	}

	public void setAtime(String atime) 
	{
		this.atime = atime;
	}

	@Override
	public String toString() 
	{
		return "Appointments [aid=" + aid + ", pid=" + pid + ", did=" + did + ", adate=" + adate + ", atime=" + atime
				+ "]";
	}
	
}
