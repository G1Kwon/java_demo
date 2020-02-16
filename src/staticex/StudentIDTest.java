package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student("LEE");
		System.out.println(studentLee.serialNum);
		
		Student studentKim = new Student("KIM");
		System.out.println(studentKim.serialNum);
		System.out.println(studentLee.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}
	
}
