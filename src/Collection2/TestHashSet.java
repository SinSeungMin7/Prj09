package Collection2;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	

	public static void main(String[] args) {
		// HashSet 중복되지않는 집합
		
		HashSet<String>  set = new HashSet<>(); 
		set.add("Java"); // Vector 는 ArrayList 와 같다
		set.add("Html");
		set.add("Oracle");
		set.add("Java");  // 대문자일시 출력은 Java 를 겹쳐서 4개만 소문자일시 Java, java 5개출력
		set.add("Spring");
		System.out.println( set.size() );
		System.out.println( set );
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.print( name + " ");
		}
		System.out.println();
		
		
	}

}
