package control;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		/* break
		 * 감싸고 있는 블록의 제어를 빠져나오는 기능.
		 * 반복문, 조건문, switch-case 등과 같이 쓰이며 
		 * 현재 수행하고 있는 블록에서 수행을 중지하고 외부로 제어가 이동한다.
		 * 
		 * 반복문과 같이 사용하면 특정 조건일 떄 반복을 중지하는 기능을 구현할 수 있다.*/
		
		int num = 1;
		int sum = 0;
		
		for(num = 1; ; num++) {
			
			sum += num;
			if (sum > 100) break;
			
		}
		System.out.println(num);
		System.out.println(sum);
		
		System.out.println("==========================");
		
		/* continue
		 * 반복의 수행 중 조건문과 조건이 맞는 경우 이후 블록 내부의 다른 수행문을 수행하지 않는다. */
		
		/* 3의 배수 출력하기 */
		for(num = 1; num <= 100; num++) {
			/* if (num % 3 == 0) */
			if (num % 3 != 0) continue;
			System.out.println(num);
		}
		
		
		System.out.println("==========================");
		
		/* 구구단을 출력할 때 짝수 단만 출력하면서
		 * 곱하는 수가 작거나 같을 때까지만 출력하시오. */
		
		int dan;
		int count;
		
		for (dan = 2; dan < 10; dan ++) {
			
			// 홀수이면 아래 로직이 무시되고 dan ++ 될 것이다.
			if (dan % 2 != 0) continue;
			for (count = 1; count < 10; count++) {
				System.out.println(dan + " X " + count + " = " + dan * count);
				// 감싸고 있는 블록 하나만 빠져나간다.
				if (count >= dan ) break;	
			}
			System.out.println();
		}		
	}	
}
