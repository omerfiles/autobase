package autoBasic.Tests;

import org.junit.Before;

import autoBasic.drivers.ChromeWebDriver;
import autoBasic.drivers.GenericWebDriver;

public class BasicTest {
	
	
	GenericWebDriver webDriver;
	
	@Before
	public void setup(){
		webDriver=new ChromeWebDriver();
		
		webDriver.init("http://localhost:4444/wd/hub");
	}

}
