package AutomationWebsite.Registration;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_RF_006 {

 @Test
	public void NewsletterNotSubscribe() {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		
		driver.findElement(By.id("input-firstname")).sendKeys("Ajinkya");
		driver.findElement(By.id("input-lastname")).sendKeys("Wadhonkar");
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());		
		driver.findElement(By.id("input-telephone")).sendKeys("89990299166");		
		driver.findElement(By.id("input-password")).sendKeys("11224455");		
		driver.findElement(By.id("input-confirm")).sendKeys("11224455");
		//Select NO Newsletter radio Subscribtion by clicking
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).click();
		
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String heading1= "Your Account Has Been Created!";
		String heading2= "Congratulations! Your new account has been successfully created!";
		String heading3= "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String heading4= "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String heading5= "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please ";
		String heading6= "contact us.";
		String heading7= "Continue";
		
	    String actualHeading = driver.findElement(By.id("content")).getText();
	    
	    Assert.assertTrue(actualHeading.contains(heading1));
	    Assert.assertTrue(actualHeading.contains(heading2));
	    Assert.assertTrue(actualHeading.contains(heading3));
	    Assert.assertTrue(actualHeading.contains(heading4));
	    Assert.assertTrue(actualHeading.contains(heading5));
	    Assert.assertTrue(actualHeading.contains(heading6));
	    Assert.assertTrue(actualHeading.contains(heading7));
	    
	    driver.findElement(By.linkText("Continue")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul[4]/li/a")).click();
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[2]/input")).isDisplayed());
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[2]/input")).isSelected());
	    
	    driver.quit();
	    
	    
	    
		
		
}
public static String generateNewEmail() {
		
		return new Date().toString().replaceAll(" ","").replaceAll("\\:","")+"@gmail.com" ;
		

		
	}}


