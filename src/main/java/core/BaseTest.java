package core;

import org.junit.After;
import org.junit.Before;

public class BaseTest  {
	
	@Before
	public void abrirPagina() {
		
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	

}
