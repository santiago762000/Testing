package com.example;

public class Person {
	private  Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void changeAddress(String streetName, String town, String zipCode){
		address.save(streetName,town,zipCode);
	}
}
