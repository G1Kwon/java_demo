package singleton;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	private CardCompany() {
		
	}
	
	public static CardCompany getInstance() {
		// TODO Auto-generated method stub
		if(instance == null)
				instance = new CardCompany();
		return instance;
	}

	public Card createCard() {
		// TODO Auto-generated method stub
		Card card = new Card();
		return card;
	}

}
