package variable;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bs = -128; // byte가 담을 수 있는 범위 -128 ~ 127

		System.out.println(bs);

		// int it = 12345678900; //2의 31승 -1 을 벗어났기에 오류가 났다.
		// 자바는 숫자를 다룰 때 기본적으로 Int(4byte) 자료을 사용하기에 오류가 났었다.
		// long(8byte)으로 사용하기 위해서는 뒤에 식별자 l, L를 추가해야 한다.
		// long lg = 12345678900;
		long lg = 1234567890L;

		System.out.println(lg);
	}

}
