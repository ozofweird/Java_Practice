package streamPractice;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		
//		// 한번 생성한 스트림은 다시 사용할 수 없음 
//		int var1 = Arrays.stream(arr);
//		int var2 = var1.sum();
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum + ", " + count);
	}

}
