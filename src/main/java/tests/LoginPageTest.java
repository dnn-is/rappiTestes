package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pages.InitialPage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	InitialPage page = new InitialPage();
	LoginPage login = new LoginPage();
	
	@Before
	public void abrirPaginaInicialClicarEntrada() {
		page.abrirPagina();
		page.clicarEntrada();
	}
	
	@Test
	public void deveVerificarTextoLogin() {
		Assert.assertEquals("Cadastre-se ou faça o login para continuar", login.obterTextoLogin());
	}

}
