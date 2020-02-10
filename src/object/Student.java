package object;

// 자바 파일 안에 여러개의 클래스가 존재할 수 있다.\
// 하지만 public 클래스는 하나이고, public 클래스와 자바 파일 이름은 동일해야 한다. 

public class Student {
	
		/*
		 * Object Oriented Programming 
		 * 객체를 정의하고 객체의 기능을 구현하며 객체간의 협력을 구현.
		 */
		
		public int StudentID;
		public String studentName;
		public String address;

		public void showStudentInfo() {
			System.out.println(studentName + " , " + address);
		}
}