package Collection3;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
	// HashMap<String, Object> map = new HashMap<String, Object>(); 이것도 가능하다
		
		map.put("num",  1);
		map.put("name", "송중기");
		map.put("kor",  90);
		map.put("eng",  95);
		map.put("math", 92);
		map.put("height", 178.3);
		
		System.out.println( map );
		
		int     num   = (int) map.get("num"); 
		System.out.println(num);
//		String name   = (String) map.get("name");
		String name   = String.valueOf( map.get("name") ); // 추천 Object -> String 으로 받을때
		System.out.println(name);
		int     kor   = (int) map.get("kor");
		System.out.println(kor);
		int     eng   = (int) map.get("eng");
		System.out.println(eng);
		int    math   = (int) map.get("math");
		System.out.println(math);
		double height = (double) map.get("height");
		System.out.println(height + "cm");
		

	}

}
