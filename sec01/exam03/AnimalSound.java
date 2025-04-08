package sec01.exam03;

/* 동물이 소리를 내는 행동을 나타내는 AnimalSound 인터페이스를 정의
 * makeSound라는 추상메소드를 가짐
 * 이를 구현하는 Dog와 Cat 클래스를 작성
 * 각 동물은 고유한 소리를 내야 함
 * 실행 클래스 AnimalTest에서 두 동물을 배열에 담아 소리를 출력
 */
public interface AnimalSound {

	// 추상 메소드
	public void makeSound();

}
