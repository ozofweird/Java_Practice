package threadPractice;

import java.io.IOException;

public class TerminateThread extends Thread {

	private boolean flag = false;
	int i;
	
	// Thread 이름 선정
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TerminateThread th1 = new TerminateThread("A");
		TerminateThread th2 = new TerminateThread("B");
		
		th1.start();
		th2.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A') {
				th1.setFlag(true);
			} else if(in == 'B') {
				th2.setFlag(true);
			} else if(in == 'M'){
				th1.setFlag(true);
				th2.setFlag(true);
				break;
			} else {
				// 두 번 출력되는 이유는 해당 문자를 받을 때 \n를 받기 때문
				System.out.println("try again");
			}
		}

	}

}
