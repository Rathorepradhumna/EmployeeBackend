package com.luv2code.springboot.cruddemo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tabular_aws")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private String salary ; 
	
	@Column(name="date_of_joining")
	private LocalDate date;
	
	@Column(name="is_permanent")
	private boolean isPermanent ;
	
	@Column(name="designation")
	private String designation;

	@Column(name="profile")
	private String profile ; 
	
	@Column(name="resume")
	private String resume ; 
	
	

	public Employee() {
	}

	public Employee(int id, String name, String salary, LocalDate date, boolean isPermanent, String designation,
			String profile, String resume) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.isPermanent = isPermanent;
		this.designation = designation;
		this.profile = profile;
		this.resume = resume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + ", isPermanent="
				+ isPermanent + ", designation=" + designation + "]";
	}

	
}
