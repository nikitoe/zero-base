
public class CreditCardTest {

	public static void main(String[] args) {
			
		CreditCard myCard = new CreditCard();	// 참조형 자료, 객체 생성
		myCard.cardNumber = 1234_5678_1234_1234L;	// '.'을 이용하여 객체에 접근
		myCard.cardOwner = "홍길동";
		
		System.out.println(myCard.cardNumber);
		System.out.println(myCard.cardOwner);
	}
}
