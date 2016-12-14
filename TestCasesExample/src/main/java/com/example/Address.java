package com.example;

import java.util.Random;

public class Address {
	private String streetName;
	private String town;
	private String zipCode;

	public void save(String streetName,String town,String zipCode){
		this.streetName=streetName;
		this.town=town;
		this.zipCode=zipCode;
	}

	public int returnNumber(){
		Random rand = new Random();
		return rand.nextInt(50) + 1;
	}


	public String printAddress() {
		return "Address{" +
				"streetName='" + streetName + '\'' +
				", town='" + town + '\'' +
				", zipCode='" + zipCode + '\'' +
				'}';
	}
}


