package interfacePractice2;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ����� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		if (ch == 'r' || ch == 'R') {
			scheduler = new RoundRobin();
		} else if (ch == 'l' || ch == 'L') {
			scheduler = new LeastJob();
		} else if (ch == 'p' || ch == 'P'){
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
