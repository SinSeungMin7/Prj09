package Collection4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	// Queue 는 Java 에 class 가 없다 -> LinkedList를 사용하여 Queue 를 흉내낸다
	public static void main(String[] args) {
		// Java 에서 Queue 는 interface 이다
		Queue<String> queue = new LinkedList<>();
		queue.add("일요일"); // LinkedList 이기에 add를 쓴다
		queue.add("월요일");
		queue.add("화요일");
		queue.add("수요일");
		queue.add("목요일");
		queue.add("금요일");
		queue.add("토요일");
		// queue 에서는 꺼낼때 poll 을 쓴다
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		System.out.println( queue.size() + queue.poll() );
		
	}

}
