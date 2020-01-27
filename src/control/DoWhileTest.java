package control;

import java.util.Scanner;

public class DoWhileTest {
	
	public static void main(String[] args) {

		/*
		 * do-while 문은 먼저 수행문을 수행하고 조건 체크한다. 한번 이상 수행문이 수행되어야 하는 경우에 사용한다.
		 * 조건식의 결과나 변수가 boolean 타입인 경우 주로 사용한다.
		 */

		int num = 1;
		int sum = 0;

		do {
			sum += num;
			num++;
		} while (num <= 10);
		System.out.println(sum);
		System.out.println(num);

		System.out.println("==========================");
		
		/*
		 * 입력 받는 정수를 모두 더해준다. 
		 * 입력된 정수가 0이면 반복문을 빠져나온다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int input;
		sum = 0;

		do {
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);
		System.out.println(sum);
	}

}
