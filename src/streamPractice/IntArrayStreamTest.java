package streamPractice;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		
//		// �ѹ� ������ ��Ʈ���� �ٽ� ����� �� ���� 
//		int var1 = Arrays.stream(arr);
//		int var2 = var1.sum();
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum + ", " + count);
	}

}
