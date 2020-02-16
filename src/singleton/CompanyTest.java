package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입 
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//두 변수는 같은 주소값를 가진다. 
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		//Calendar calendar = new Calendar();
	}
	
}
