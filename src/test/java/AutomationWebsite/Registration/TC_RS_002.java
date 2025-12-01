package AutomationWebsite.Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RS_002 {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
    driver.findElement(By.id("ap_email_login")).sendKeys("ajinkyawadhonkar2@gmail.com");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("auth-fpp-link-bottom")).click();
    driver.findElement(By.id("continue")).click();
    
    
    
    
    }

}
//String email = "ajuwadhonkar@gmail.com";
//String appPasscode = "Mandar@8634";
//
//driver.get("https://www.amazon.in/");
//
//driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
//driver.findElement(By.id("ap_email_login")).sendKeys("ajuwadhonkar@gmail.com");
//driver.findElement(By.id("continue")).click();
//driver.findElement(By.id("auth-fpp-link-bottom")).click();
//driver.findElement(By.id("continue")).click();