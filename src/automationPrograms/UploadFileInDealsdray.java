package automationPrograms;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLibrary.ReadData;

public class UploadFileInDealsdray {
	
	@Test
	public void UplaodFileInDealsdray() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://demo.dealsdray.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsername().clear();
		String username = ReadData.fromPropertyFile("Username");
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().clear();
		String password = ReadData.fromPropertyFile("Password");
		loginPage.getPassword().sendKeys(password);
		loginPage.getLoginButton().click();
		
		OrderPage orderPage = new OrderPage(driver);
		orderPage.getOrder().click();
		orderPage.getOrders().click();
		orderPage.getBulkOrders().click();
//		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Download Sample Sheet']"))));
		
		Runtime.getRuntime().exec("./autoITPrograms/ChooseFile.exe");
		Runtime.getRuntime().exec("./autoITPrograms/UploadFile.exe");
			
		
		
		ImportPage importPage = new ImportPage(driver);
		importPage.getImport().click();
		importPage.getValidate().click();
		driver.switchTo().alert().accept();
		
	}

}
