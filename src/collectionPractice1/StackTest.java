package collectionPractice1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("Stack이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack myStack = new MyStack();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		Stack<String> stack = new Stack<String>();
		stack.add("D");
		System.out.println(stack.peek());
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("가");
		queue.add("나");
		queue.add("다");
		
		System.out.println(queue.remove());
	}

}
