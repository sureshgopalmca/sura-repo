package com.mytaxi.MytaxiServerApplicantTestApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue
	private Long id;
	private String manufacturer;
	private String license_plate;
	private Integer seat_count;
	private String convertible;
	private Integer rating;
	private String engibe_type;
	public Car() {
	}
	public Car(Long id, String manufacturer, String license_plate, Integer seat_count, String convertible,
			Integer rating, String engibe_type) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.license_plate = license_plate;
		this.seat_count = seat_count;
		this.convertible = convertible;
		this.rating = rating;
		this.engibe_type = engibe_type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public Integer getSeat_count() {
		return seat_count;
	}
	public void setSeat_count(Integer seat_count) {
		this.seat_count = seat_count;
	}
	public String getConvertible() {
		return convertible;
	}
	public void setConvertible(String convertible) {
		this.convertible = convertible;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getEngibe_type() {
		return engibe_type;
	}
	public void setEngibe_type(String engibe_type) {
		this.engibe_type = engibe_type;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", license_plate=" + license_plate + ", seat_count="
				+ seat_count + ", convertible=" + convertible + ", rating=" + rating + ", engibe_type=" + engibe_type
				+ "]";
	}
	
	
}
