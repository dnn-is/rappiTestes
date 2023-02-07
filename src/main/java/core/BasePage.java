package core;

import static core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	public WebDriverWait wait = new WebDriverWait(getDriver(), 5);
	Actions action = new Actions(getDriver());

	public BasePage() {

		PageFactory.initElements(getDriver(), this);
	}

	public void click(WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}

	public void openInitialPage(String url) {
		getDriver().get(url);
		getDriver().manage().window().maximize();
	}
	
	public boolean isElementVisible(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void sendKeys(WebElement element, String text) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		}
	}

	public String getText(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element)).getText();
		return element.getText();
	}

	public void waitToBeClickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitToBeVisible(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void alternarAbas(int index) {

		List<String> abas = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(index));
	}

	public void moveToElement(WebElement element) {
		waitToBeVisible(element);
		action.moveToElement(element).build().perform();
	}




	}


