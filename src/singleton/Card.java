package singleton;

public class Card {

	private int cardNumber;
	private static int serialNum = 10000;

	Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCardNumber() {
		// TODO Auto-generated method stub
		return cardNumber;
	}

}
