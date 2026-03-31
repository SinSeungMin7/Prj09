package Collection4;

import java.util.Stack;

public class TestStack {
	// Java 는 Stack을 class로 만들어놓았다
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Mango");
		// push 는 늘어나고 pop 은 줄어든다
		String st1 = stack.pop(); // 스택1(s1)의 값을 pop 한다
		String st2 = stack.pop();
		String st3 = stack.pop();
		// 스택(st1,2,3) 출력 
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}

}
