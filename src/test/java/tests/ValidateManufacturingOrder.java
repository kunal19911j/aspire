package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static properties.RuntimeProp.*;

import java.time.Duration;

import static driver.Initialize.driver;
import driver.Initialize;
import functionLibrary.ApplicationPage;
import functionLibrary.InventoryPage;
import functionLibrary.LoginPage;
import functionLibrary.ManufacturingOrderPage;
import objectRepository.Manufacturing;

public class ValidateManufacturingOrder {

	@BeforeMethod
	public void SetUp() {
		Initialize.init();
	}

	@Test
	public void validateMO() {
		LoginPage lp = new LoginPage();
		ApplicationPage app = new ApplicationPage();
		InventoryPage inventory = new InventoryPage();
		ManufacturingOrderPage manuOP = new ManufacturingOrderPage();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Manufacturing manuOR = new Manufacturing();

		lp.login();
		app.navigateToInventory();
		inventory.createProduct(prodName);
		inventory.updateQuantity(prodQuantity);
		app.navigateToManufacturing();
		manuOP.createManufacturingOrder(prodName, prodQuantity);

		// assert link with name product_id contains correct product
		assertEquals(driver.findElement(manuOR.spanProdId).getText().trim(), prodName);

		// assert link next to label Product is correct product
		assertEquals(driver.findElement(manuOR.spanProdId2).getText().trim(), prodName);

		// assert quantity
		assertEquals(
				wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.spanQtyProducing)).getText().trim(),
				prodQuantity);
		assertEquals(driver.findElement(manuOR.spanProdQty).getText().trim(), prodQuantity);
		assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.spanProdUOMqty)).getText().trim(),
				prodQuantity);

		// Assert Done stage is current and highlighted state
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(manuOR.btnDoneHighlighted)).getText().trim()
				.contains("DONE"));
	}

	@AfterMethod
	public void tearDown() {
		Initialize.quit();
	}
}
