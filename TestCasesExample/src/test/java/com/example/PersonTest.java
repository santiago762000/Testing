package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;


public class PersonTest {

	@Test
	public void verifyAddressFormat(){
		/*
		* I this test I'm using stub objects to check functions
		* */
		Address address= new Address();
		Person person=new Person();
		person.setAddress(address);
		person.changeAddress("Main Av","LazyTown","JW210");
		Assert.assertEquals(person.getAddress().printAddress(),"Address{streetName='Main Av', town='LazyTown', zipCode='JW210'}");
	}



	@Test
	public void verifyExecutionOfSaveMethodFromAddressClass() throws Exception {
		/*
		* In this example we are going to test the execution
		* of the save method in the Address Class(Mocked object). To test the execution we
		* call changeAddress from the person object.*/
		Address address= Mockito.mock(Address.class);
		Person person=new Person();
		person.setAddress(address);
		person.changeAddress("Main Av","LazyTown","JW210");
		Mockito.verify(address).save(anyString(),anyString(),anyString());
	}


	@Test
	public void verifyDynamicObject(){
		/*
		* Although returnNumber returns a random number, when(...)
		* sets a default value for the test case. For that reason,
		* Assert.assertEquals is always true.
		* */
		Address address= Mockito.mock(Address.class);
		when(address.returnNumber()).thenReturn(123);
		Assert.assertEquals(address.returnNumber(),123);
	}
}
