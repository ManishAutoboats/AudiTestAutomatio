package Bollywood;

public class LoginPage {
	
	
	 public static void main(String[] args) {
		 
		 System.out.println("Test");
		 
	
		 
		 LoginPage login= new LoginPage();
		 
		 login.verifyLoginWithUserName();
		 login.loginWithOTP();
		 login.loginWithSocaMedia();
		 login.loginWithInvalidDetails();
		 login.verifyLoginPageHeading();
		 
		 
	}
	
	
	

// user define
	public void verifyLoginWithUserName() {
		
		System.out.println("LoginUserName");
		

	}

	public void loginWithOTP() {

		System.out.println("LoginOTP");
	}

	public void loginWithSocaMedia() {
		System.out.println("LoginMedia");

	}
	
	public void loginWithInvalidDetails() {
		System.out.println("Logininvalid");
		
	}
	
	public void verifyLoginPageHeading() {
		System.out.println("LoginHeading");
		
	}
}

