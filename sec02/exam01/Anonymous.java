package sec02.exam01;

public class Anonymous {
	// 필드 초기값으로 대입
	// 익명 객체 필드
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	// 익명 객체 로컬 변수
	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		// 로컬 변수 사용
		// 익명 객체 매개값
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
