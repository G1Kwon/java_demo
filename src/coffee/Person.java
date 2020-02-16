package coffee;

public class Person {

	private String name;
	private int money;

	public Person(String name, int money) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		// TODO Auto-generated method stub
		String message = starCoffee.brewing(4000);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}

	public void buyHollysCoffee(HollysCoffee hollysCoffee, int money) {
		// TODO Auto-generated method stub
		String message = hollysCoffee.brewing(4500);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}

}
