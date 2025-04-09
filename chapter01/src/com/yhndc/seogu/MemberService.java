package com.yhndc.seogu;

public class MemberService {

	boolean now = false;

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			now = true;
			System.out.println(id + "님이 로그인 하셨습니다.");
			return true;
		} else {
			System.out.println("ID 또는 Password를 잘못 입력하셨습니다.");
			return false;
		}
	}

	void logout(String id) {
		if (now && id.equals("hong")) {
			now = false;
			System.out.println(id + "님이 로그아웃 하셨습니다.");
		} else {
			System.out.println("로그인 되어 있지 않습니다.");
		}
	}
}
