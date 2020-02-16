package thisExample;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoName = new Person();
		
		personNoName.showInfo();
		
		Person personLee = new Person("LEE", 20);
		
		personLee.showInfo();
	}
}
