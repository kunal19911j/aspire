package functionLibrary;

import static driver.Initialize.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.Manufacturing;

public class ManufacturingOrderPage {
	Manufacturing manuOR = new Manufacturing();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public void createManufacturingOrder(String prodName, String prodQty) {
		driver.findElement(manuOR.btnCreate).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.inpProductName)).sendKeys(prodName);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']//a[text()='" + prodName + "']")))
				.click();
		driver.findElement(manuOR.btnAddLine).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.inpProduct)).sendKeys(prodName);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//li[@class='ui-menu-item']//a[text()='" + prodName + "'])[2]")))
				.click();
		driver.findElement(manuOR.btnProdUOMqty).clear();
		driver.findElement(manuOR.btnProdUOMqty).sendKeys(prodQty);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.btnConfirm)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.inpProdQty)).clear();
		driver.findElement(manuOR.inpProdQty).sendKeys(prodQty);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.btnMarkAsDone)).click();
	}
}
