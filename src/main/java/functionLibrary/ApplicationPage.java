package functionLibrary;

import objectRepository.Application;
import static driver.Initialize.driver;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationPage {
	Application appOR = new Application();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public void navigateToInventory() {
		if (!driver.getCurrentUrl().equals("https://aspireapp.odoo.com/web#cids=1&home="))
			driver.findElement(appOR.btnApplication).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(appOR.btnInventory)).click();
		wait.until(ExpectedConditions.titleIs("Inventory Overview - Odoo"));
	}

	public void navigateToManufacturing() {
		if (!driver.getCurrentUrl().equals("https://aspireapp.odoo.com/web#cids=1&home="))
			driver.findElement(appOR.btnApplication).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(appOR.btnManufacturing)).click();
		wait.until(ExpectedConditions.titleIs("Manufacturing Orders - Odoo"));
	}
}
