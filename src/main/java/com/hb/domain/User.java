package com.hb.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name = "user_id")
	@GenericGenerator(strategy="increment" ,name = "gen1")
	@GeneratedValue(generator="gen1")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="unid")
	private List<PhoneNumber> phones;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the phones
	 */
	public List<PhoneNumber> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<PhoneNumber> phones) {
		this.phones = phones;
	}
	
	
}
