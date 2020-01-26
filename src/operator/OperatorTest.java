package operator;

public class OperatorTest {

	public static void main(String[] args) {

		int num1 = -10;

		// -연산자만 부호가 바뀐다.
		System.out.println(+num1);
		System.out.println(-num1);

		// 대입연산자를 사용하지 않으면 부호는 변하지 않는다.
		System.out.println(num1);

		int num2 = 10 % 3;
		System.out.println(num2);

		// 복합 대입 연산자 : 대입연산자와 다른 연산자가 함께 쓰인다.
		int num3 = 10;
		num3 += 2;

		System.out.println(num3);

		int score = 100;

		// 실행하기 전에 1을 증가시켜라
		System.out.println(++score);
		System.out.println(score);
		// = score = score + 1;
		// = score += 1;

		// 실행한 후에 1을 증가시켜라
		System.out.println(score++);
		System.out.println(score);

		int num4 = 10;
		int i = 2;

		// 앞의 항이 false 가 되었기에 뒤의 것은 수행이 되지 않았다.
		boolean value = ((num4 = num4 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(num4);
		System.out.println(i);
		System.out.println(value);

		// 앞의 항이 true 가 되었기에 뒤의 것은 수행이 되었다.
		boolean value1 = ((num4 = num4 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(num4);
		System.out.println(i);
		System.out.println(value1);

		// 삼항연산자 : 계산된게 맞으면 A, 아니라면 B
		int num5 = 10;
		int num6 = 20;
		int max = (num5 < num6) ? num5 : num6;
		System.out.println(max);

		int num7 = 0B00001010; // 2진수 10
		int num8 = 0B00000101; // 2진수 5
		
		// 비트 단위 AND 1 반환 그 이외는 0
		System.out.println(num7 & num8);
		// 비트 단위 OR 0 반환 그 이외는 1
		System.out.println(num7 | num8);
		// 두개의 비트가 서로 다른 경우에 1을 반환
		System.out.println(num7 ^ num8);
		// 변수를 x비트 만큼 왼쪽으로 이동 대입하기 전에는 실제로 변하는건 아니다.
		System.out.println(num7);
		// 변수에서 곱하기 2의 N승.
		System.out.println(num7 << 1);
		// 변수를 x비트 만큼 오른쪽으로 이동 대입하기 전에는 실제로 변하는건 아니다.
		System.out.println(num7);
		// 변수에서 나누기 2의 N승의 몫.
		System.out.println(num7 >> 2);
		// 변수를 x비트 만큼 오른쪽으로 이동 채워지는 비트가 부호와 상관없이 0이다. 대입하기 전에는 실제로 변하는건 아니다. 
		System.out.println(num7 >>> 1);
		
	}
}
