import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeDemo {

	
	@Test
public void testCase() {
	

	
		
	
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	//Thread.sleep(5000);
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MP_link"))).click();
	
	
	//driver.findElement(By.id("MP_link")).click();

}
}