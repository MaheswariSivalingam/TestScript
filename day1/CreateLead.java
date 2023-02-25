package week7.day1;




import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;





public class CreateLead extends  ProjectSpecificationMethod {


	@BeforeTest
	public void setup() {
		 excelFile = "CreateLead";
	}
	
  @Test(dataProvider = "fetchdata")
	public  void runCreateLead(String cname,String firstname,String lastname) {
	  
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		

}
 
}






