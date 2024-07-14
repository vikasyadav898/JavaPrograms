package SeleniumTest.SeleniumTest;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleListDropDwon {
	@Test
	public void handleDropDwon() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Resources ']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.stalenessOf((WebElement)list));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("DEVELOPER"));
			{
				list.get(i).click();
			}
		}
		
		//driver.close();
	}

}
