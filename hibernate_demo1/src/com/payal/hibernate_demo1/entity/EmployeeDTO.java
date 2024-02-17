package com.payal.hibernate_demo1.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.criterion.Restrictions;

@Entity
public class EmployeeDTO {
	
@Id
private int id;

private String name;

private String designation;

private double  salary;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
	
}
@Override
public String toString() {
	return "EmployeeDTO [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}
	
}
