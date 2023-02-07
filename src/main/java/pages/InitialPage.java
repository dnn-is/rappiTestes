package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class InitialPage extends BasePage {
	
	@FindBy(xpath = "//span[@class='sc-fdt2fy-16 lacFRs']")
	WebElement entrada;
	
	public void abrirPagina() {
		openInitialPage("https://www.rappi.com.br/");
	}
	
	public void clicarEntrada() {
		click(entrada);
	}
	

	
	

}
