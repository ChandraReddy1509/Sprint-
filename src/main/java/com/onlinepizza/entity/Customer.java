package com.onlinepizza.entity;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table
public class Customer extends User {

	private Long customerMobile;
	private String customerName;
	private String customerEmail;
	private String customerAddress;

	public Customer() {
	}

	public Customer(Long customerMobile, String customerName, String customerEmail, String customerAddress) {
		super();

		this.customerMobile = customerMobile;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
	}

	public Long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(Long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerMobile=" + customerMobile + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerAddress=" + customerAddress + "]";
	}

}
