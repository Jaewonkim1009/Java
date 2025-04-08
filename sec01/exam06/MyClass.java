package sec01.exam06;

import sec01.exam03.Audio;

public class MyClass {

	RemoteControl rc = new Television();

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	MyClass() {

	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
	}

	void methodB(RemoteControl rc) {
		rc.turnOff();
		rc.setVolume(5);
	}
}
