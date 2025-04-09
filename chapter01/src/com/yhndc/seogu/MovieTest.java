package com.yhndc.seogu;

public class MovieTest {

	public static void main(String[] args) {
		Movie myMovie = new Movie("어벤져스", 150, "액션");
		myMovie.printMovieInfo();
		myMovie.checkLength();

		System.out.println();

		Movie myMovie2 = new Movie("위키드", 160, "판타지");
		myMovie2.printMovieInfo();
		myMovie2.checkLength();

		System.out.println();

		Movie myMovie3 = new Movie("겨울왕국", 108, "애니메이션");
		myMovie3.printMovieInfo();
		myMovie3.checkLength();
	}

}
