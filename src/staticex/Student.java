package staticex;

public class Student {

	// static 변수는 인스턴스 생성과 상관없이 먼저 생성이 된다.
	public static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		studentID = serialNum++;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "no address";
		studentID = serialNum++;
	}
	
	public void showStudentinfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		int i = 0;
		//멤버 변수는 인스턴스가 생성될 때 만들어지는 인스턴스 변수이기 때문이다.
		// Static 메서드 안에서는 인스턴스 변수를 사용할 수 없다. 
		//studentName = "Lee"; 
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
