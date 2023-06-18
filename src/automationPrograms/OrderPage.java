package automationPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Order']")
	private WebElement Order;
	
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement Orders;
	
	@FindBy(xpath = "//button[text()='Add Bulk Orders']")
	private WebElement BulkOrders;
	
	

	public WebElement getOrder() {
		return Order;
	}

	public WebElement getOrders() {
		return Orders;
	}

	public WebElement getBulkOrders() {
		return BulkOrders;
	}

	

	
}
