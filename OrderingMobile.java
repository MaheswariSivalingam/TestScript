package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://dev62925.service-now.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
            driver.findElement(By.id("sysverb_login")).click();
            Shadow shadow=new Shadow(driver);
            shadow.setImplicitWait(30);
            shadow.findElementByXPath("//div[text()='All']").click();
            shadow.setImplicitWait(20);
            shadow.findElementByXPath("//span[text()='Service Catalog']").click();
            WebElement find = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	        driver.switchTo().frame(find);
	        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	        driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
	        driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
	        WebElement tool1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	        Select drop2 =new Select(tool1);
	        drop2.selectByValue("Unlimited");
	        driver.findElement(By.xpath("//label[text()='Blue']")).click();
	        driver.findElement(By.xpath("//label[text()='256 GB [add $100.00]']")).click();
	        driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	        String text = driver.findElement(By.xpath("//span[contains(text(),'Thank you, your request has been submitted')]")).getText();
	        System.out.println(text);
	        String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	        System.out.println(text2);
	        driver.close();
	}

}
