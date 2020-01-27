package control;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		/* 조건문 : 조건식의 결과에 따라 수행문이 실행된다. */

		char vehicle = 'H';

		if (vehicle == 'H') {
			System.out.println("현대자동차입니다.");
		} else {
			System.out.println("기아자동차입니다.");
		}

		System.out.println("==========================");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;

		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 1500;
		} else if (age < 20) {
			charge = 2000;
		} else {
			charge = 3000;
		}
		System.out.println("나이 : " + age);
		System.out.println("입장료는 " + charge);

		System.out.println("==========================");

		int score = scanner.nextInt();
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("점수는 " + score);
		System.out.println("학점은 " + grade);

		// if-else 조건문은 조건 연산자로 구현할 수 있다.
		/*
		 * if(a>b) { max = b; } else { max = b; } ==> max (a>b) ? a:b;
		 */
	}
}
