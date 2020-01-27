package control;

public class NestedRoopTest {

	public static void main(String[] args) {

		// For 문을 이용한 구구단.
		int dan;
		int count;

		for (dan = 2; dan < 10; dan++) {

			for (count = 1; count < 10; count++) {
				System.out.println(dan + " X " + count + " = " + dan * count);
			}
			System.out.println();
		}

		System.out.println("==========================");
		
		// While 문을 이용한 구구단.
		dan = 2;
		count = 1;

		while (dan < 10) {

			count = 1;

			while (count < 10) {
				System.out.println(dan + " X " + count + " = " + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
