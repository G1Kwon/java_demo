package hiding;

public class DateTest {

	public static void main(String[] args) {

		Date date1 = new Date(16, 2, 2020);
		
		System.out.println(date1.isValid());
		
		Date date2 = new Date(29, 2, 2020);
		
		System.out.println(date2.isValid());
	}

}
