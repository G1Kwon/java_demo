package coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 100000);
		Person Lee = new Person("Lee", 200000);
		StarCoffee starCoffee = new StarCoffee();
		HollysCoffee hollysCoffee = new HollysCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		kim.buyHollysCoffee(hollysCoffee, Menu.HOLLYSLATTE);
		Lee.buyStarCoffee(starCoffee, Menu.STARLATTE);
		Lee.buyHollysCoffee(hollysCoffee, Menu.HOLLYSAMERICANO);
	}

}
