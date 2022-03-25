package com.cybage.bookManagementSystem.model;

public class Publisher {
	String name;
	int p_Id;
	
	
	
	public Publisher(String name, int p_Id) {
		super();
		this.name = name;
		this.p_Id = p_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", p_Id=" + p_Id + "]";
	}
}
