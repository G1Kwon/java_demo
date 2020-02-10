package object;

public class Instance {
	
//	클래스로부터 생성된 객체
//	힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성
//	클래스를 기반으로 new 키워드를 이용하여 여러 개의 인스턴스를 생성 
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "Lee";
		studentLee.address = "Seoul";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "Kim";
		studentKim.address = "Busan";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
