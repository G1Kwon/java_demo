package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	//private으로 선언한 변수를 외부 코드에서 사용하려면 
	//get() set() 메서드이용.

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if (isValid) {
		System.out.println(year + "년 " + month + "월 " + day + "일.");
		} else {
			System.out.println("유효하지 않아요");
		}
	}

}
