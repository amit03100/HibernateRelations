package com.hb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone_number")
public class PhoneNumber {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long phone;
	
	@Column(name = "number_type")
	private String numberType;
	
	public PhoneNumber() {
		System.out.println("Phone number 0-param constructor");
	}
	
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the numberType
	 */
	public String getNumberType() {
		return numberType;
	}
	/**
	 * @param numberType the numberType to set
	 */
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", " + (numberType != null ? "numberType=" + numberType : "") + "]";
	}
	
	
	
	
}
