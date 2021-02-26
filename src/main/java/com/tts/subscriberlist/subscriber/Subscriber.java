package com.tts.subscriberlist.subscriber;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;



@Entity
public class Subscriber {
	//set id as primary key
	@Id
	// allows for the id to generated
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	
	@Column
	//allows the date to be generated
	@CreationTimestamp
	private Date signedUp;
	
	
	//constructor
	//non-arguement contructor needed for JPA
	public Subscriber() {}
	
	
    public Subscriber(String firstName, String lastName, String userName, Date signedUp){
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.signedUp = signedUp;	
}

  //getter and setter methods
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Date getSignedUp() {
		return signedUp;
	}


	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}	
	//toString method

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", signedUp=" + signedUp + "]";
	}
 
}