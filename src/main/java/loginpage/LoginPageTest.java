package loginpage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import initialpage.InitialPage;

public class LoginPageTest extends BaseTest {
	
	InitialPage page = new InitialPage();
	LoginPage login = new LoginPage();
	
	@Before
	public void clicarEntrada() {
		page.clicarEntrada();
	}
	
	@Test
	public void deveVerificarTextoLogin() {
		Assert.assertTrue(login.isLoginTextPresent());
	}
	
	@Test
	public void deveVerificarBotoes() {
		Assert.assertTrue(login.isFacebookButtonPresent());
		Assert.assertTrue(login.isAppleButtonPresent());
		Assert.assertTrue(login.isGoogleButtonPresent());
		Assert.assertTrue(login.isPhoneButtonPresent());
		Assert.assertTrue(login.isHaveAccountButtonPresent());
	}

}
