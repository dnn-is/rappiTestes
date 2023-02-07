package tests;

import org.junit.Test;

import core.BaseTest;
import pages.InitialPage;

public class InitialPageTest extends BaseTest {
	InitialPage page = new InitialPage();
	
	@Test
	public void primeiroTeste() {
		page.abrirPagina();
		page.clicarEntrada();
	}
}
