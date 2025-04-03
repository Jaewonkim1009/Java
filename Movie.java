package com.yhndc.seogu;

public class Movie {

	String title;
	int runtime;
	String genre;

	Movie() {
	}

	Movie(String title, int runtime, String genre) {
		this.title = title;
		this.runtime = runtime;
		this.genre = genre;
	}

	void printMovieInfo() {
		System.out.println("영화 제목 : " + title + ", " + "상영 시간 : " + runtime + "분, " + "장르 : " + genre);

	}

	void checkLength() {
		if (runtime >= 120) {
			System.out.println("영화 " + title + "은(는) 상영 시간이 긴 영화 입니다.");
		} else {
			System.out.println("영화 " + title + "은(는) 상영시간이 길지 않은 영화 입니다.");
		}
	}
}
