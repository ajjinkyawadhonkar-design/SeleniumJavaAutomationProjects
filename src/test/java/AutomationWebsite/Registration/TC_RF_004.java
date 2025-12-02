package AutomationWebsite.Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_004 {
@Test
	public void warningCheck() {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("http://tutorialsninja.com/demo");
		
		// Click on 'My Account' Drop menu
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		// COMPAIRING WARNING WITH TASE CASES
		
		String warning1 =driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div")).getText();
		String warning2 =driver.findElement(By.xpath("//*[@id=\"account\"]/div[3]/div/div")).getText();
		String warning3 =driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/div/div")).getText();
		String warning4 =driver.findElement(By.xpath("//*[@id=\"account\"]/div[5]/div/div")).getText();
		String warning5 =driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")).getText();
		String warning6 =driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).getText();
		
		
		//Statement from testcases 
		
		String inputWarning1 ="First Name must be between 1 and 32 characters!";
		String inputWarning2 ="Last Name must be between 1 and 32 characters!";
		String inputWarning3 ="E-Mail Address does not appear to be valid!";
		String inputWarning4 ="Telephone must be between 3 and 32 characters!";
		String inputWarning5 ="Password must be between 4 and 20 characters!";
		String inputWarning6 ="Warning: You must agree to the Privacy Policy!";
		
		//Compairing Test cases and warning contains are same or not!
		
		Assert.assertTrue(warning1.contains(inputWarning1));
		Assert.assertTrue(warning2.contains(inputWarning2));
		Assert.assertTrue(warning3.contains(inputWarning3));
		Assert.assertTrue(warning4.contains(inputWarning4));
		Assert.assertTrue(warning5.contains(inputWarning5));
		Assert.assertTrue(warning6.contains(inputWarning6));
		
		
		driver.quit();
	}

}
