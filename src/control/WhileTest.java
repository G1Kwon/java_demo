package control;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		/* 반복문 : 동일한 수행문을 조건에 맞는 동안 수행하도록 하는 기능 */
		int num = 1;
		int sum = 0;

		while (num <= 10) {
			System.out.println(num);
			sum += num;
			num++;
		}
		System.out.println(sum);

		System.out.println("==========================");

		/*
		 * 입력 받는 정수를 모두 더해준다. 
		 * 입력된 정수가 0이면 반복문을 빠져나온다.
		 */

		Scanner scanner = new Scanner(System.in);
		int input;
		sum = 0;
		input = scanner.nextInt();

		while (input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		System.out.println(sum);
	}
}
