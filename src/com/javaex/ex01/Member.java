package com.javaex.ex01;

//클래스
public class Member {
	// 필드
	private String id;
	private String name;
	private int point;

	// 메소드
	public Member() {
	}

	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	// getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id +"), " + point+"점");
	}
	

}
