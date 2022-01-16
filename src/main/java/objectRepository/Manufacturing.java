package objectRepository;

import org.openqa.selenium.By;

public class Manufacturing {
	public final By btnCreate = By.xpath("//button[contains(text(),'Create')]");
	public final By btnSave = By.xpath("//button[contains(text(),'Save')]");
	public final By btnConfirm = By.xpath("//span[text()='Confirm']/parent::button");
	public final By btnMarkAsDone = By.xpath("//span[text()='Mark as Done']//parent::button[@name='button_mark_done']");

	public final By inpProductName = By.xpath("//div[@name='product_id']//input");
	public final By inpProdQty = By.xpath("//input[@name='qty_producing']");

	public final By btnAddLine = By.xpath("//div[@class='tab-pane active']//a[text()='Add a line']");
	public final By inpProduct = By.xpath(
			"//div[@class='tab-pane active']//div[@name='product_id']//input[@class='o_input ui-autocomplete-input']");
	public final By btnProdUOMqty = By.xpath("//input[@name='product_uom_qty']");
	
	public final By spanProdId = By.xpath("//a[@name='product_id']/span");
	public final By spanProdId2 = By.xpath("//label[text()='Product']/../following-sibling::td//span");
	public final By spanQtyProducing = By.xpath("//span[@name='qty_producing']");
	public final By spanProdQty = By.xpath("//div/span[@name='product_qty']");
	public final By spanProdUOMqty = By.xpath("(//span[@name='product_uom_qty'])[1]");
	public final By btnDoneHighlighted = By.xpath("//div[@name='state']/button[@aria-checked='true' and @title='Current state' and contains(text(),'Done')]");

	

	

	

	

	

}
