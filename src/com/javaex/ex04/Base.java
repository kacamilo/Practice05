package com.javaex.ex04;

public class Base {

	public void service(String state) {
		System.out.println(state);

		switch (state) {
		case "낮":
			day();
			break;
		case "밤":
			night();
			break;
		case "오후":
			afternoon();
			break;
		}

		// 코드작성할것
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤에는 숙면");
		// 코드작성할것
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
