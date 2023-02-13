package initialpage;

import static core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class InitialPage extends BasePage {
	
	@FindBy(xpath = "//span[@class='sc-fdt2fy-16 lacFRs']")
	WebElement entrada;
	
	@FindBy(xpath = "//span[@class='sc-bczRLJ cbQfNr']")
	WebElement local;
	
	@FindBy(xpath = "//input[@data-qa='address-input']")
	WebElement campoEndereco;
	
	@FindBy(xpath = "//button[@aria-label='Rua Francisca Dantas Souza']")
	WebElement enderecoAtual;
	
	@FindBy(xpath = "//p[@class='chakra-text css-bhw6kn']")
	WebElement enderecoTexto;
	
	@FindBy(xpath = "//button[@data-qa='confirm-address']")
	WebElement confirmarEnedereco;
	
	@FindBy(xpath = "//input[@data-qa='address-description']")
	WebElement addressDescription;
	
	@FindBy(id = "save-addess-button")
	WebElement saveAdrressButton;
	
	@FindBy(xpath = "//div[@class='css-19b1ukb']")
	WebElement promotionBanner;
	
	public void clicarEntrada() {
		click(entrada);
	}
	
	public void clickPromotionBanner() {
		click(promotionBanner);
	}
	
	public void clicarLocal() {
		click(local);
	}
	
	public boolean isEnderecoCorreto() {
		if(enderecoTexto.getText().contains("Jardim Cidade Universitária")) {
			return true;
		}
		
		return false;
	}
	
	public boolean isPromotionBannerPresent() {
		List<WebElement> promotionBanner = getDriver().findElements(By.xpath("//div[@class='css-19b1ukb']"));
		if(promotionBanner.size()>0) {
			return true;
		}
		
		return false;
	}
	
	public void fornecerEndereco() {
		String endereco = "Rua Francisca Dantas de Sousa";
		sendKeys(campoEndereco, endereco);
	}
	
	public void clicarEndereco() {
		click(enderecoAtual);
	}
	
		
	public void clicarConfirmarEndereco() {
		click(confirmarEnedereco);
	}
	
	public void provideAddressDescription() {
		sendKeys(addressDescription, "casa");
	}

	public void saveAdrress() {
		click(saveAdrressButton);
	}
	
	

}
