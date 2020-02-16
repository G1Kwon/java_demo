package corporation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(2000);
		this.money -= 2000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "남은 돈은 " + money);
	}
	
}
