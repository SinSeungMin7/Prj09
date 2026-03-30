package Collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
	
		// 배열 -> ArrayList 로 변경하는 방법
		String [] names = {"홍길동", "이길동","박길동","최길동"};
		List<String> nameList = Arrays.asList( names ); // Arrays 는 asList를 붙여쓴다
		System.out.println( nameList );
		
	//	nameList.add( "나길동" ); // Exception in thread "main" java.lang.UnsupportedOperationException 에러가 뜬다 
		// 배열을 ArraysList로 눈속임한것이라 add() 할수 없다
		// Arrays.asList() 변환한 리스트는 add() 할 수 없다 -> size() 변경 불가능
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.print( name + " " );
			
		}
		System.out.println();
		
		// sort
		// Collections.sort( nameList ); // ascending sort(오름차순)
		Collections.sort( nameList );
		
		System.out.println( nameList );
		
		// 오름차순 정렬됨 ArrayList 배열 뒤집기
		Collections.reverse( nameList ); // 배열 뒤집기를 한것. 눈속임이다 
		System.out.println( nameList );
		
		// 람다식 : ( a, b ) -> a.compareTo( b )  -> 아래 두 줄을 줄인 문장
		// boolean function( String a, String b ) {
		//		return a.compareTo( b );
		// }
		
		// 오름차순 정렬
		Collections.sort( nameList, (a,b) -> a.compareTo(b) );
		System.out.println( nameList );
		
		// 내림차순 정렬
		Collections.sort( nameList, (a,b) -> b.compareTo(a) );
		System.out.println( nameList );
		
	}
}
