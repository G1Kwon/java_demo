package object;

public class StudentTest {
	
	public static void main(String[] args) {
		
		//new 키워드를 이용하여 생성자로 생성
		Student studentLee = new Student();
		
		//생성에 사용한 변수(참조변수)로 클래스의 속성, 메서드 참조 
		studentLee.studentName = "Kim";
		studentLee.address = "Seoul";
		
		studentLee.showStudentInfo();
				
	}

}
