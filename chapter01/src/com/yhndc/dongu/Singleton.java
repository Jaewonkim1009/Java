package com.yhndc.dongu;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return instance;
	}
}
