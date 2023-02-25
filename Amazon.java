package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox']/../..)[3]")).click();
        String text2 =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(text2);
        String text1= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).getText();
        System.out.println(text1);
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).getText();
        System.out.println(text3);
        String text4 = driver.findElement(By.xpath("//span[text()='(66% off)']")).getText();
        System.out.println(text4);
        
     
	}

}
