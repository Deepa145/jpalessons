package com.chainsys.jpa.application.doctor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Doctor {
	@Id
	private int id;                     
	private String Name;                
	private Date DOB;                        
	private String speciality;           
	private String city;                
	private long phone_no;            
	private float standard_fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public float getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}
	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%d,%d",id,Name,DOB,speciality,city,phone_no,standard_fees);
}
}