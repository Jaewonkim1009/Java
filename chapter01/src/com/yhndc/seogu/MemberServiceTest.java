package com.yhndc.seogu;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService myMember = new MemberService();

		myMember.login("hong", "12345");
		myMember.logout("hong");

	}
}
