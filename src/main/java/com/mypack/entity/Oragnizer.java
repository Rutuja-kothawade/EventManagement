package com.mypack.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Oragnizer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String contactInfo;
	//@OneToMany(mappedBy = "organizer")
	//private List<Event> events;
	public Oragnizer(Long id, String name, String contactInfo, List<Event> events) {
		super();
		this.id = id;
		this.name = name;
		this.contactInfo = contactInfo;
		//this.events = events;
	}
	public Oragnizer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	/*
	 * public List<Event> getEvents() { return events; } public void
	 * setEvents(List<Event> events) { this.events = events; }
	 */

	
	
}
