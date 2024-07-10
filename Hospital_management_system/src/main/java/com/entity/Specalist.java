package com.entity;

public class Specalist {
	private int id;
	private String specialName;
	
	public Specalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Specalist(int id, String specialName) {
		super();
		this.id = id;
		this.specialName = specialName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialName() {
		return specialName;
	}
	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}
	
	
}
