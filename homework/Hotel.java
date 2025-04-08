package homework;

/* 호텔의 객실 예약과 예약 현황을 나타낼 수 있도록 Hotel 클래스를 작성
 * 호텔에는 10개의 객실이 있으며, 객실 번호는 1~10번까지 이다.
 * 객실 번호와 이름으로 객실을 예약하는 add() 메서드
 * 현재 예약된 객실 번호와 고객 이름을 보여주는 show() 메서드가 필요하다.
 * [조건] 호텔에는 다수의 객실이 있지만, 객실은 호텔 내부에서만 사용한다
 * 따라서 객실을 위한 Room 클래스는 Hotel 클래스의 중첩 클래스로 작성하면 편리하다.
 */
public class Hotel {

	// 중첩 클래스
	private class Room {
		int roomNumber;
		String name;
		
		Room(int roomNumber) {
			this.roomNumber = roomNumber;	
		}		
	}
	
	private Room[] rooms = new Room[10];
	
	
	// 생성자
	public Hotel() {
		for (int i = 0; i < 10; i++) {
			rooms[i] = new Room(i + 1);
		}
	}

	// 예약 메소드
	public void add(int roomNumber, String name) {
		if (roomNumber < 1 || roomNumber > 10) {
			System.out.println("객실은 1 ~ 10호실까지 입니다.");
			return;
		}
		
		Room room = rooms[roomNumber - 1];
		if (room.name == null) {
			room.name = name;
		} else {
			System.out.println(roomNumber + "방은 이미 " + name + "님이 예약했습니다.");
		}
	}
	
	// 예약 출력메소드
	public void show() {
		for (Room room : rooms) {
			if (room.name != null) {
			System.out.println(room.roomNumber + "번 방을 " + room.name + "님이 예약했습니다.");
		}
	}
	}
}
