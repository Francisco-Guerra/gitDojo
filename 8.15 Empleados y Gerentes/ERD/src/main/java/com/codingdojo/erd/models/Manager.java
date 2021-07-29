package com.codingdojo.erd.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "managers")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=1, max=35)
	private String firstName;
	@Size(min=1, max=35)
	private String lastName;
	private Date createdAt;
    private Date updatedAt;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name="employees", 
	joinColumns = @JoinColumn(name="manager_id"),
	inverseJoinColumns = @JoinColumn(name="employee_id"))
	private List<Manager> employees;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name="employees", 
	joinColumns = @JoinColumn(name="employee_id"),
	inverseJoinColumns = @JoinColumn(name="manager_id"))
	private List<Manager> managerEmployees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Manager> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Manager> employees) {
		this.employees = employees;
	}

	public List<Manager> getManagerEmployees() {
		return managerEmployees;
	}

	public void setManagerEmployees(List<Manager> managerEmployees) {
		this.managerEmployees = managerEmployees;
	}
	 
}
