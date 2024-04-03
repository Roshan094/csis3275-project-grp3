package com.csis3275.model_grp3;

public class HomeModel {

	private String firstName;
	private String lastName;
	
	public HomeModel() {
		
	}
	
	public HomeModel(String firstName, String lastName, String studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
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
}
