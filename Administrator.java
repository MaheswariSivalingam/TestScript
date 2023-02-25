package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Administrator {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        driver.findElement(By.xpath("//span[text()='Learn More']")).click();
    	Set<String> windowHandles = driver.getWindowHandles();
    	System.out.println(windowHandles.size());
    	List<String>lstWindow=new ArrayList<String>(windowHandles);
    	driver.switchTo().window(lstWindow.get(1));
    	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
    	Shadow shadow=new Shadow(driver); 
        shadow.findElementByXPath("//span[text()='Learning']").click();
        Thread.sleep(2000);
        Actions builder=new Actions(driver);
        WebElement mouse = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
        builder.moveToElement(mouse).perform();
        shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
        String title = driver.getTitle();
        if(title.contains("Certification - Administrator Overview"))
        {
        	System.out.println("Title contains  Certification - Administrator Overview");
        }
        else
        {
        	System.out.println("Title not contains  Certification - Administrator Overview");
        }
         List<WebElement> obj = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
         for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).getText());
		}
        WebElement findElement = driver.findElement(By.xpath("(//a[text()='Sched­ule Now'])[7]"));
        builder.scrollToElement(findElement).perform();
        File source = driver.getScreenshotAs(OutputType.FILE);
        File dest=new  File("./snap/certificate.png");
        FileUtils.copyFile(source, dest);
        driver.quit();
	}

}
