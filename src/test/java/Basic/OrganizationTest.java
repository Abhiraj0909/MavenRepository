package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {

	@Test
	public void CreateOrganizationTest(){
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//To launch application
		driver.get("http://localhost:8888/");
		
		//Login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
//		//Click on Organizations
//		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
//		
//		//Click on Create Organization..(+)
//		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
//		
//		driver.findElement(By.name("accountname")).sendKeys("TCS01");
//		
//		
		
	}

}
