package thisExample;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("no name", 10);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + " " + age);
	}

}
