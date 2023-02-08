package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pages.InitialPage;

public class InitialPageTest extends BaseTest {
	InitialPage page = new InitialPage();
	
	@Before
	public void entrarNoSite() {
		page.abrirPagina();
	}
	
	@Test
	public void primeiroTeste() {
		
		page.clicarEntrada();
	}
	
	@Test
	public void deveFornecerLocal() {
		page.clicarLocal();
		page.fornecerEndereco();
		page.clicarEndereco();
		page.clicarConfirmarEndereco();
		Assert.assertTrue(page.isEnderecoCorreto());
	}
}
