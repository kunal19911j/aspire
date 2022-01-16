package functionLibrary;

import objectRepository.Login;
import static driver.Initialize.driver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import properties.RuntimeProp;

public class LoginPage {
	Login lor = new Login();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public void login() {
		driver.findElement(lor.InpEmail).sendKeys(RuntimeProp.userName);
		driver.findElement(lor.InpPassword).sendKeys(RuntimeProp.password);
		driver.findElement(lor.btnLogin).click();
		wait.until(ExpectedConditions.urlToBe("https://aspireapp.odoo.com/web#cids=1&home="));
	}
}
