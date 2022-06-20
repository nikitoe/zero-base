
public class CreditCard {
	private long cardNumber;
	public String cardOwner;
	
	public long balance;
	public long point;
	
	public void use(long amount) {
		balance += amount;
	}
	
	public void payBill(long amount) {
		balance -= amount;
		addPoint(amount / 1000);
	}
	
	public void addPoint(long point) {
		this.point += point;
	}
	
	//setter
	public void setCardNumber(long cardNumber) {
		
		if(cardNumber < 1000_0000_0000_0000L) {
			System.err.println("카드 번호에 문제가 있음");
		} else {
			this.cardNumber = cardNumber;
		}
		
	}
	
	public long getCardNumber() {
		return 0;
		// return cardNumber;
	}
}




