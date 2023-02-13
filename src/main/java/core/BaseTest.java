package core;

import static core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

public class BaseTest  {
	
	BasePage basePage = new BasePage();
	
	
	@Before
	public void abrirPagina() {
		basePage.openInitialPage("https://www.rappi.com.br/");
	}
	
	@After
	public void tearDown() {
		killDriver();
	}
	
	

}
