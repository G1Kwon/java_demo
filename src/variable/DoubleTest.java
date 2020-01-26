package variable;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바에서 실수는 double(4byte) 자료형을 기본으로 쓴다.
		// float(8byte)를 사용하고 싶으면 뒤에 식별자 f, F를 사용한다.
		double dNum = -3.14;

		float fNum = -3.14F;
		System.out.println(dNum);
		System.out.println(fNum);

		// 실수는 부동소수점 방식으로 표현한다.
		// 지수와 가수로 표현되는 부동소수점 방식은 0을 표현할 수 없다.
		// 따라서 부동소수점 방식에서는 약간의 오차가 발생할 수 있다.

		dNum = 1;

		for (int i = 0; i < 10000; i++) {

			dNum = dNum + 0.1;
		}
		
		//1001이 나오지 않지?
		System.out.println(dNum);
		
		boolean isMarried = false;
		
		System.out.println(isMarried);
		
		//Java10 부터 자료형 없이 변수 사용하기가 가능하다.
		//원래는 자료형을 명시해주어야 하는데 지역변수에 한해서 가능하다.
		//ex)var i = 10;

	}

}
