package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class LoginPage extends BasePage {
	@FindBy(xpath = "//p[@class='chakra-text css-t4p47']")
	WebElement textoLogin;
	
	public String obterTextoLogin() {
		return getText(textoLogin);
	}

}
