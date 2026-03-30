package Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Student { 
	private int      id;
	private String name;
	// private 외부에서 값을 넣는방법 생성자 사용
	// Alt + Shift + S -> Generate to Fileds
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// Alt + Shift + S -> ToString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	// hashcode() and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

public class TestSetStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList<>(); // ArrayList 밑 빨간줄일때 -> Ctrl + shift + O 사용 -> 위쪽에 import java.util.ArrayList; 생성
		
	//	Student s1 = new Student(1,"가나");
		studList.add( new Student(1,"가나") );
		studList.add( new Student(2,"나나") );
		studList.add( new Student(3,"다나") );
		studList.add( new Student(1,"가나") );
		System.out.println( studList );
		System.out.println( studList.size() );
		System.out.println( "=================================================" );
		// System.out.println( studList.size() ); 4가 출력된다
		//----------------------------------------------
		HashSet<Student> studSet = new HashSet<>();
		
		studSet.add( new Student(1,"가나") );
		studSet.add( new Student(2,"나나") );
		studSet.add( new Student(3,"다나") );
		studSet.add( new Student(1,"가나") );
		System.out.println( studSet );
		System.out.println( studSet.size() );
		// 중복을 걸러내지 못한다
		// Alt + Shift + S -> hashcode() and equals 을 입력하면 중복을 걸러낼수 있다 
		// System.out.println( studSet.size() ); 3 이 출력된다
		//----------------------------------------------
		
		
	}

}
