import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://google.com");
//		driver.manage().window().maximize();
//		driver.wait(0);
		
		//Using By name
//		driver.findElement(By.name("q")).sendKeys("Barcelona FC");
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		driver.findElement(By.name("btnK")).click();
		
		//Using By XPath
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Barcelona FC");
//		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();

		driver.close();
		driver.quit();
		
	}

}
