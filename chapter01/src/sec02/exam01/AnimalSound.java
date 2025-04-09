package sec02.exam01;

/* 인터페이스: AnimalSound
 * 1. 메서드: makeSound() 동물이 소리를 내는 동작을 정의 (반환값 없음)
 * 클래스: Animal
 * 1. 속성: name(문자열, private), age(정수,private)
 * 2. 생성자: 이름과 나이를 초기화
 * 3. getter / setter: 캡슐화를 위해 속성에 접근 및 수정 가능
 * 4. 기본 makeSound() 메서드를 구현 (예: :동물이 소리를 냅니다.")
 * 클래스: Dog와 Cat
 * 1. Animal을 상속받고, AnimalSound 인터페이스를 구현
 * 2. makeSound() 메서드를 오버라이딩하여 각각 "멍멍"과 "야옹" 출력
 * 메인 클래스: AnimalTest
 * main 메서드에서 Dog와 Cat객체 생성
 * 각 동물의 이름, 나이, 소리를 출력 (getter 사용)
 */
public interface AnimalSound {

	String makeSound();
}
