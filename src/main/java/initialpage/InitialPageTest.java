package initialpage;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class InitialPageTest extends BaseTest {
	InitialPage initialPage = new InitialPage();
	

	@Test
	public void provideLocation() {
		initialPage.clicarLocal();
		initialPage.fornecerEndereco();
		initialPage.clicarEndereco();
		initialPage.clicarConfirmarEndereco();
		Assert.assertTrue(initialPage.isEnderecoCorreto());
	}
	
	@Test
	public void verifyPromotionBanner() {
		Assert.assertTrue(initialPage.isPromotionBannerPresent());
	}
	
	@Test
	public void qualquer() {
		initialPage.clickPromotionBanner();
		initialPage.fornecerEndereco();
		initialPage.clicarEndereco();
		initialPage.clicarConfirmarEndereco();
		initialPage.saveAdrress();
		
	}
}
