package control;

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		
		/* 연산자와 두수를 변수로 선언한 후 사칙 연산이 수행되는 프로그램을 만들어보세요. */
		
		char operator = '+';
		int num1 = 10;
		int num2 = 5;
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 오류입니다");
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		
		System.out.println("==========================");
		
		/* 다이아몬드를 만드세요. */
		
		System.out.println("홀수 값을 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //다른 홀수 값을 넣어보세요
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
		
	}
}
