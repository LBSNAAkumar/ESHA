package com.springcore.Emp;

import java.util.List;
public class Employee 
{
 private String name;
 private int age;
 private List<String> phones;
 private Address address;
/*
 public Employee(String name, int age, List<String> phones, Address address) 
{
	this.name = name;
	this.age = age;
	this.phones = phones;
	this.address = address;
}

@Override
public String toString() 
{
	return this.name+" : "+this.age+" : "+this.phones+" : "+this.address   ;
	
}

**/
 

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee() {
	super();

}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
}



  
 
 
}
