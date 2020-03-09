package com.mytaxi.MytaxiServerApplicantTestApplication;

import java.util.Date;

public class Driver {

	private Long id;
	private Date date_created;
	private String name;
	private Long carid;
	
	public Driver() {
	}

	public Driver(Long id, Date date_created, String name, Long carid) {
		super();
		this.id = id;
		this.date_created = date_created;
		this.name = name;
		this.carid = carid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCarid() {
		return carid;
	}

	public void setCarid(Long carid) {
		this.carid = carid;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", date_created=" + date_created + ", name=" + name + ", carid=" + carid + "]";
	}
	
	
	
}
