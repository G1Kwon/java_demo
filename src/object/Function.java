package object;

public class Function {

	/*
	 * 함수 하나의 기능을 수행하는 일련의 코드 
	 * 함수는 호출하여 사용하고 기능이 수행된 후 값을 반환 할 수 있다.
	 * 함수로 구현된 기능은 여러곳에서 호출되어 사용될 수 있다.
	 * 함수를 호출할 때 스택 메모리를 사용한다.
	 */
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// void는 return을 안한다.
	public static void sayhello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
	}
	
}
