package Bollywood;

public class PaymentPage {
	
	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		login.verifyLoginWithUserName();
		
		BasketPage basket= new BasketPage();
		basket.addToCart();
		
		PaymentPage payment= new PaymentPage();
		payment.paymentWithCOD();
		
	}

	public void paymentWithCard() {
		
		System.out.println("Payment with Card");
	}

	
	public void paymentWithPaytm() {
		
	}
	
	public void paymentWithCOD() {
		
	}
}
