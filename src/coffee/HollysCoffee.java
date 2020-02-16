package coffee;

public class HollysCoffee {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if (money == Menu.HOLLYSAMERICANO) {
			return "할리스 아메리카노를 구입했습니다.";
		} else if(money == Menu.HOLLYSLATTE) {
			return "할리스 라뗴를 구입했습니다.";			
		} else {
			return null;
		}
	}

}
