package com.springcore.Emp;

import java.util.Set;

public class Address 
{
   private Set<String> address;

 /*
public Address(Set<String> address) 
{
	super();
	this.address = address;
}

@Override
public String toString() 
{
	//return this.address.toString();
	return super.toString();
}

**/

   
   


public Set<String> getAddress() {
	return address;
}

public void setAddress(Set<String> address) {
	this.address = address;
}



public Address() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() 
{
	return "Address [address=" + address + "]";
}


   

   
   
   
}
