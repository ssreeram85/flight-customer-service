package com.tetrasoft.us.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class CustomerDetailsEntiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String city;
	private String state;
	private Integer pincode;
	private Boolean bookingstatus;
	private Integer pnrNumber;
	

	public CustomerDetailsEntiry(String firstName, String lastName, String email, String mobileNumber,
			String city, String state, Integer pincode, Boolean bookingstatus, Integer pnrNumber) {
	

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.bookingstatus = bookingstatus;
		this.pnrNumber = pnrNumber;
	}



	public CustomerDetailsEntiry() {
	
	}

	public Boolean getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(Boolean bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	public Integer getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	
	

}
