package automationPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class ImportPage {
	
	public ImportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Import']")
	private WebElement Import;
	
	@FindBy(xpath = "//button[text()='Validate Data']")
	private WebElement Validate;

	public WebElement getImport() {
		return Import;
	}

	public WebElement getValidate() {
		return Validate;
	}
	

}
