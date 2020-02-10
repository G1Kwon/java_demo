package object;

public class ClassPersonTest {
	
	int age;
	String name;
	boolean isMarried;
	int children;

	public static void main(String[] args) {
		
		ClassPersonTest person = new ClassPersonTest();
		person.age = 40;
		person.name = "JAMES";
		person.isMarried = true;
		person.children = 3;
		
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.isMarried);
		System.out.println(person.children);
		
	}
	
}
