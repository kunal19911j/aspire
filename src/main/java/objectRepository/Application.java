package objectRepository;

import org.openqa.selenium.By;

public class Application {
	public final By btnApplication = By.xpath("//a[@title='Applications']");
	public final By btnInventory = By.xpath("//div[text()='Inventory']/parent::a");
	public final By btnManufacturing = By.xpath("//div[text()='Manufacturing']/parent::a");
}
