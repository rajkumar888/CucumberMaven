package dd_Test;

import org.testng.annotations.Test;

import dd_Pages.LoginPage;

public class TestCaseForLoginScenario {
	
	
	
	@Test
	public void TestGmailLogin(){
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.TestLogin();
		
	}

}
