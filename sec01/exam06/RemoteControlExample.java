package sec01.exam06;

import sec01.exam03.Audio;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(2);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

	}

}
