package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * int rank = scanner.nextInt(); char medalColor;
		 * 
		 * switch (rank) { case 1: medalColor = 'G'; System.out.println("Gold Medal");
		 * //break를 사용하지 않으면 break가 사용된 부분까지 case문이 실행이 된다. break; case 2: medalColor =
		 * 'S'; System.out.println("Silver Medal"); break; case 3: medalColor = 'B';
		 * System.out.println("Bronze Medal"); break; default: medalColor = 'A'; }
		 * System.out.println(rank + "등은 " + medalColor + "메달입니다. ");
		 */		
		//Java7 부터 문자열 사용 가능.
		
		System.out.println("==========================");
		
		String medal = scanner.nextLine();
		char medalColor;

		switch (medal) {
		case "Gold":
			medalColor = 'G';
			System.out.println("Gold Medal");
			//break를 사용하지 않으면 break가 사용된 부분까지 case문이 실행이 된다. 
			break;
		case "Silver":
			medalColor = 'S';
			System.out.println("Silver Medal");
			break;
		case "Bronze":
			medalColor = 'B';
			System.out.println("Bronze Medal");
			break;
		default:
			medalColor = 'A';
			System.out.println("You did good job");
		}
		System.out.println(medalColor + " Congratulation!! ");
	}
}
