package driver;

import static properties.RuntimeProp.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	public static WebDriver driver = null;

	public static void init() {
		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\src\\resources\\chromedriver.exe");
				driver = new ChromeDriver(SharedCapabilities.setDefaultCapabilities());
			} else {
				// TODO:handle other browsers
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.get(baseUrl);
		}
	}

	public static void quit() {
		driver.quit();
		driver = null;
	}
}
