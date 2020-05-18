package com.javaex.ex07;

public class Friend {
	private String name;
	private String phone;
	private String school;
	
	
	public Friend () {}
	public Friend (String name, String phone, String school) {
		this.name = name;
		this.phone = phone;
		this.school = school;
	}
	
	//g/s
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getphone() {
		return phone;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	public String getSchool () {
		return school;
	}
	public void setSchool (String school) {
		this.school = school;
	}
	//메소드
	public void showInfo () {
		System.out.println("이름: " + name + "  핸드폰: " + phone + "  학교:" + school);
	}
}
