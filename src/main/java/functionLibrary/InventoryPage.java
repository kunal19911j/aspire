package functionLibrary;

import static driver.Initialize.driver;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Inventory;

public class InventoryPage {
	Inventory ior = new Inventory();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public void createProduct(String prodName) {
		browseMenu("Products", "Products");
		wait.until(ExpectedConditions.titleIs("Products - Odoo"));
		driver.findElement(ior.btnCreate).click();
		wait.until(ExpectedConditions.titleIs("New - Odoo"));
		driver.findElement(ior.inpProdName).sendKeys(prodName);
		driver.findElement(ior.btnSave).click();
		wait.until(ExpectedConditions.titleIs(prodName + " - Odoo"));
	}

	public void updateQuantity(String quantity) {
		driver.findElement(ior.btnUpdateQuantity).click();
		wait.until(ExpectedConditions.titleIs("Update Quantity - Odoo"));
		driver.findElement(ior.btnCreate).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ior.inpLocList)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ior.listItemPartnerLoc)).click();
		driver.findElement(ior.inpInvQuan).clear();
		driver.findElement(ior.inpInvQuan).sendKeys(quantity);
		driver.findElement(ior.btnSave).click();
	}

	public void browseMenu(String parent, String childItem) {
		driver.findElement(ior.productsParentMenu).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ior.productsChildMenu)));
		driver.findElement(ior.productsChildMenu).click();
	}
}
