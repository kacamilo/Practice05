package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member M1 = new Member();
		M1.setName("정우성");
		M1.setId("jws");
		M1.setPoint(50000);
		M1.showInfo();
		
		Member M2 = new Member();
		M2.setName("유재석");
		M2.setId("yjs");
		M2.setPoint(30000);
		M2.showInfo();
		
		Member M3 =new Member();
		M3.setName("이효리");
		M3.setId("lhr");
		M3.setPoint(40000);
		M3.showInfo();
		
	}

}
