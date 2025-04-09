package com.yhndc.dongu;

public class GetSet {
	// 필드 선언
	private int speed;
	private boolean stop;

	// getter 메소드 생성
	public int getSpeed() {
		return speed;
	}

	// setter 메소드 생성
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
