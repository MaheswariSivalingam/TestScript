package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {

	public static void main(String[] args) {
			 ChromeOptions option = new ChromeOptions();
		        option.addArguments("--disable-notifications");
		        ChromeDriver driver=new ChromeDriver(option);
		        driver.manage().window().maximize();
		        driver.get("https://login.salesforce.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		        driver.findElement(By.xpath("//input[@id='Login']")).click();
		        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		        driver.findElement(By.xpath("//p[text()='Sales']")).click();
		        WebElement findElement = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
		        driver.executeScript("arguments[0].click();",findElement);
		        driver.findElement(By.xpath("//div[@title='New']")).click();
		        driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("SaleForce Automation by Maheswari");
		        driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("1/12/2023");
		        driver.findElement(By.xpath("//button[@aria-label='Stage, --None--']")).click();
		        driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[3]")).click();
		        driver.findElement(By.xpath("//button[text()='Save']")).click();
		        String text = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		        System.out.println(text);
	}

}
