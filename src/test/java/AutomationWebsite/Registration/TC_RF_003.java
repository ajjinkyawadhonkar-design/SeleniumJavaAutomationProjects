package AutomationWebsite.Registration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_003 {
	@Test
	public  void verifyRegistering(){
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("Ajinkya");
		driver.findElement(By.id("input-lastname")).sendKeys("Wadhonkar");
		driver.findElement(By.id("input-email")).sendKeys(genratenewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("987654321");
		driver.findElement(By.id("input-password")).sendKeys("8634");
		driver.findElement(By.id("input-confirm")).sendKeys("8634");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	
		Assert.assertTrue(driver.findElement(By.linkText("Success")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		
		String Heading1 = "Your Account Has Been Created!";
		String Heading2 = "Congratulations! Your new account has been successfully created!";
		String Heading3 = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String Heading4 = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String Heading5 = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		String Heading6 = "contact us.";
		
		String ActualHeading = driver.findElement(By.id("content")).getText();
		
		Assert.assertTrue(ActualHeading.contains(Heading1)); 
		Assert.assertTrue(ActualHeading.contains(Heading2));
		Assert.assertTrue(ActualHeading.contains(Heading3));
		Assert.assertTrue(ActualHeading.contains(Heading4));
		Assert.assertTrue(ActualHeading.contains(Heading5));
		Assert.assertTrue(ActualHeading.contains(Heading6));
		
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	
		 driver.quit();
		
		
	}
public static String genratenewEmail() {
	return new Date().toString().replaceAll(" ","").replaceAll("\\:","")+"@gmail.com";
}
	
	}

