package homework;

/* 은행 계좌 입출금 시스템
 * 요구사항
 * 1. BankAccount 클래스
 * - 속성: balance (정수, 계좌 잔액)
 * - 메서드
 * deposit(int amount): 입금
 * withdraw(int amount): 출금
 * - 동기화: 잔액 변경 시 스레드 간 충돌 방지
 * 
 * 2. DepositThread와 WithdrawThread 클래스
 * - Runnable 인터페이스를 구현
 * - 각각 입금과 출금을 반복 수행 (예: 5회씩)
 * 
 * 3. 메인 클래스: BankApp
 * - 초기 잔액 1000원으로 계좌 생성
 * - 입금 스레드와 출금 스레드를 각각 실행
 * - 최종 잔액 출력
 */

public class BankAccount {

}
