package autoBasic.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeWebDriver extends GenericWebDriver {

	@Override
	public void init(String remoteUrl) throws Exception {

		Capabilities capabilities = DesiredCapabilities.chrome();

		remoteWebDriver = new RemoteWebDriver(new URL(remoteUrl), capabilities);
	}

}
