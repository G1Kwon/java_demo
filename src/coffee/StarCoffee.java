package coffee;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if (money == Menu.STARAMERICANO) {
			return "스타벅스 아메리카노를 구입했습니다.";
		} else if(money == Menu.STARLATTE) {
			return "스타벅스 라뗴를 구입했습니다.";			
		} else {
			return null;
		}
	}
	
}
