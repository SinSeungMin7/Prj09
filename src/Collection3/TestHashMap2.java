package Collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(10, "인사");// map 에 자료를 추가할때 .put 한다
		map.put(20, "자재");
		map.put(30, "연구개발");
		map.put(40, "총무");
		map.put(50, "생산");
		// 30번이 어느 부서인가? 
		System.out.println( map );
		System.out.println( map.get(30) );
		System.out.println( map.size() );
		
		// map 에 추가
		map.put(70, "기획");
		map.put(10, "홍보");
		System.out.println( map );
		System.out.println( map.get(10) );
		System.out.println( map.size() );

		// 모두출력 1.
		System.out.println("모두출력 1");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println( key + ":" + val );
		}
		System.out.println();
		
		System.out.println("모두출력 2");
		// 모두출력 2.
		// 1. 키목록 : Set keySet()
		Set<Integer> keySet = map.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println( key + " " + map.get(key) );
		}

		// arrayList 와 Map 은 중요하다!!! 
		
	}

}
