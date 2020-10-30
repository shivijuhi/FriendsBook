package com.friends.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int user_id;
	@Column(name="first_name")
	String first_name;
	@Column(name="last_name")
	String last_name;
	@Column(name="Address")
	String Address;
	@Column(name="City")
	String City;
	@Column(name="email_id")
	String email_id;
	@Column(name="phone_number")
	int phone_number;

	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String first_name, String last_name, String Address,String City,String email_id, int phone_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.Address = Address;
		this.City = City;
		this.email_id = email_id;
		this.phone_number = phone_number;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}


}
