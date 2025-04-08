package sec01.exam06;

import sec01.exam03.Searchable;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		RemoteControl rc = tv;
		Searchable searchable = tv;

	}

}
