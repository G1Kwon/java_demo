package variable;

public class ConversionTest {

	public static void main(String[] args) {

		// 형변환 : 서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어난다.
		// 묵시적 형변환(implicit type conversion)
		// 작은 수에서 큰 수로, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
		// byte(1byte) -> short(2byte), char(2byte) -> int(4byte) -> long(8byte)
		// -> float(4byte) -> double(8byte)
		byte bNum = 10;
		int iNum = bNum; // 묵시적 형변환 byte(1byte) -> int(4byte)

		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2; // 덜 정밀한 int 에서 더 정밀한 float로 대입되는 것이기에 문제가 없다.

		System.out.println(iNum2);
		System.out.println(fNum);

		double dNum;
		dNum = fNum + iNum;

		System.out.println(dNum);

		// 명시적 형변환(explicit type conversion)
		// 변환되는 자료형을 명시. 자료의 손실이 발생할 수 있다.
		// 묵시적 형변환의 반대방향
		int i = 1000;
		byte bNum2 = (byte) i;

		System.out.println(bNum2);

		double dNum1 = 1.2;
		float fNum1 = 0.9F;

		//dNum1형변환 ,fNum1형변환이 각각 일어나면서 소수점 이하가 버려지면서 1, 0이 되었다.
		int iNum3 = (int) dNum1 + (int) fNum1;
		//1.2 + 0.9 = 2.1 이것에서 int 형변환이 일어났기에 2가 되었다. 
		int iNum4 = (int) (dNum1 + fNum1);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
