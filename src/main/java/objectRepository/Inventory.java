package objectRepository;

import org.openqa.selenium.By;

public class Inventory {
	public final By productsParentMenu = By.xpath("//ul[@class='o_menu_sections']//li/a[contains(text(),'Products')]");
	public final By productsChildMenu = By.xpath("//span[text()='Products']/parent::a[@role='menuitem']");
	public final By btnCreate = By.xpath("//button[contains(text(),'Create')]");
	public final By inpProdName = By.xpath("//input[@placeholder='Product Name']");
	public final By btnSave = By.xpath("//button[contains(text(),'Save')]");
	public final By btnUpdateQuantity = By.xpath("//button[@name='action_update_quantity_on_hand']");
	public final By inpLocList = By.xpath("//div[@name='location_id']//input[@class='o_input ui-autocomplete-input']");
	public final By btnExpandLocList = By.xpath("//div[@name='location_id']//a[@class='o_dropdown_button']");
	public final By listItemPartnerLoc = By.xpath("//li[@class='ui-menu-item']//a[text()='Partner Locations/HN']");
	public final By btnExpandPkgList = By.xpath("//div[@name='package_id']//a[@class='o_dropdown_button']");
	public final By inpInvQuan = By.xpath("//input[@name='inventory_quantity']");
}
