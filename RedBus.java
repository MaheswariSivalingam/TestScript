package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("src")).sendKeys("Chennai");
        driver.findElement(By.className("selected")).click();
        driver.findElement(By.id("dest")).sendKeys("Bangalore");
        driver.findElement(By.className("selected")).click();
        driver.findElement(By.xpath("//td[text()='26']")).click();
        driver.findElement(By.id("search_btn")).click();
        String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[6]")).click();
        String text4 = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
        System.out.println(text4);
        String text1 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
        System.out.println(text1);
        driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
        String text3 = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])[2]")).getText();
        System.out.println(text3);
	}

}
