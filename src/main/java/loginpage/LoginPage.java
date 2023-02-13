package loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class LoginPage extends BasePage {
	@FindBy(xpath = "//p[@class='chakra-text css-t4p47']")
	WebElement textoLogin;
	
	@FindBy(xpath = "//button[@data-qa='facebook-option']")
	WebElement facebookButton;
	
	@FindBy(xpath = "//button[@data-qa='google-option']")
	WebElement googleButton;
	
	@FindBy(xpath = "//button[@data-qa='apple-option']")
	WebElement appleButton;
	
	@FindBy(xpath = "//button[@data-qa='phone-option']")
	WebElement phoneButton;
	
	@FindBy(xpath = "//button[@data-qa='have-account-option']")
	WebElement haveAccountButton;
	
	public boolean isLoginTextPresent() {	
		return isElementVisible(textoLogin);
	}
	
	public boolean isFacebookButtonPresent() {
		return isElementVisible(facebookButton);
	}
	
	public boolean isAppleButtonPresent() {
		return isElementVisible(appleButton);
	}
	
	public boolean isGoogleButtonPresent() {
		return isElementVisible(googleButton);
	}
	
	public boolean isPhoneButtonPresent() {
		return isElementVisible(phoneButton);
	}
	
	public boolean isHaveAccountButtonPresent() {
		return isElementVisible(haveAccountButton);
	}
}
