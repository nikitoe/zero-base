package exam01;

public class CreditCardTest {

	public static void main(String[] args) {
			
		CreditCard myCard = new CreditCard();	// 참조형 자료, 객체 생성\
		
		/*
		CreditCard myOtherCard;
		myOtherCard = new CreditCard();
		*/
		
		//myCard.cardNumber = 1234_5678_1234_1234L;	// '.'을 이용하여 객체에 접근
		myCard.setCardNumber(234_5678_1234_1234L);
		myCard.cardOwner = "홍길동";
		
		System.out.println("========================");
		System.out.println(myCard.getCardNumber());
		System.out.println(myCard.cardOwner);
		System.out.println(myCard.balance);
		System.out.println(myCard.point);
		
		myCard.use(8000);
		myCard.use(12000);
		myCard.use(21000);
		myCard.payBill(30000);
		
		System.out.println("========================");
		System.out.println(myCard.getCardNumber());
		System.out.println(myCard.cardOwner);
		System.out.println(myCard.balance);
		System.out.println(myCard.point);

	}
}
