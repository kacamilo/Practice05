package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance = 0;

	// 생성자 작성
	public Account(String acc) {
		accountNo = acc;
		System.out.println(acc);
	}

	// 필요한 메소드 작성
	public void deposit(int money) {
		balance = balance + money;
	}

	public void withdraw(int money) {
		balance = balance - money;
	}

	public void showBalance() {
		System.out.println(balance);
	}
}
