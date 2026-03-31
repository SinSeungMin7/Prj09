package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class TextArrayList {

	public static void main(String[] args) {
		// 배열으로 만든 공식은 추가를 못한다
		int [] arr = new int[3]; 
		arr[0]     = 10;
		arr[1]     = 20;
		arr[2]     = 30;
//		arr[4]     = 40; // ArrayIndexOutOfBoundsException // Error 에러 발생 // 0~2까지만 출력 그 이상 추가하면 에러가 발생
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
		
		//----------------------------------------
		// ArrayList 로 만든공식은 추가를 할 수 있다
		ArrayList<Integer> numList = new ArrayList<>();  // 사이즈를 입력하지 않는다
		numList.add( 10 ); // 0
		numList.add( 20 ); // 1	
		numList.add( 30 ); // 2
		numList.add( 40 ); // 3
		numList.add( 50 ); // 4
		numList.add( 80 ); // 5 
		// add 추가하면 출력화면에도 계속 추가가된다
		for (int i = 0; i < numList.size(); i++) {
			System.out.print( numList.get(i) + " " ); // 꺼낼땐 get 을 써서 입력된값을 출력한다			
		}
		System.out.println();
		
		// 출력후 배열을 플러스(더 붙이기위한 작업)
		numList.add( 100 );
		numList.add( 35 );
		for (Integer num : numList) {
			System.out.print( num + " ");
		}
		System.out.println();
		
		Collections.sort( numList, (a,b) -> a-b );
		System.out.println( numList );
		
		Collections.sort( numList, (a,b) -> b-a );
		System.out.println( numList );
		
	}

}
