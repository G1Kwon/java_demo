package singleton;

public class CardTest {

	public static void main(String[] args) {
		
		// 싱글톤 패턴 
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}
	
}
