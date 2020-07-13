package lamdaPractice;

// 람다식을 위한 인터페이스임을 알려줌
// 함수형 인터페이스는 두 개 이상의 메서드를 선언할 수  없음
@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
}
