package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Friend[] friendArray = new Friend[3];
		
		Friend F1= new Friend();
		System.out.println("친구를 3명 등록해 주세요");
		System.out.print("이름: ");
		F1.setName(sc.nextLine());
		System.out.print("핸드폰: ");
		F1.setPhone(sc.nextLine());
		System.out.print("학교: ");
		F1.setSchool(sc.nextLine());
		System.out.println("-----------------------------------------");
		Friend F2= new Friend();
		System.out.print("이름: ");
		F2.setName(sc.nextLine());
		System.out.print("핸드폰: ");
		F2.setPhone(sc.nextLine());
		System.out.print("학교: ");
		F2.setSchool(sc.nextLine());
		System.out.println("-----------------------------------------");
		Friend F3= new Friend();
		System.out.print("이름: ");
		F3.setName(sc.nextLine());
		System.out.print("핸드폰: ");
		F3.setPhone(sc.nextLine());
		System.out.print("학교: ");
		F3.setSchool(sc.nextLine());
		System.out.println("-----------------------------------------");
		
		friendArray[0] = F1;
		friendArray[1] = F2;
		friendArray[2] = F3;
		
		for (int i = 0; i<friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		
		
		
		
	}

}
