package streamPractice;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
	
}

public class ReduceStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		
		// ���� ���� ����
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)-> a + b));
		System.out.println();
		
		// ���� ���ڿ��� �� ��� ��� 1
		String[] greetings = {"�ȳ��ϼ���---", "hello", "Good morning", "�ݰ����ϴ�"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)-> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));
		
		// ���� ���ڿ��� �� ��� ��� 2
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
