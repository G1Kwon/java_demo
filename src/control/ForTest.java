package control;

public class ForTest {

	public static void main(String[] args) {

		/*
		 * 일정 횟수에 기반한 반복을 구현할 때 효율적이다.
		 * 배열과 함꼐 많이 사용된다.
		 */

		int count;
		int sum = 0;

		for (count = 0; count < 10; count++) {
			sum += count;
		}
		
		/*
		 * for (int i = 0; i < 10; count++) { sum += count; }
		 */
		
		System.out.println(sum);
		
		System.out.println("==========================");
		
		int num = 1;
		int total = 0;

		while (num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
	}

}
