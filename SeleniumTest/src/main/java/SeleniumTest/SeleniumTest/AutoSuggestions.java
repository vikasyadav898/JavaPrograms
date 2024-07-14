package SeleniumTest.SeleniumTest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {
	@Test
	public void selectValueFromDropdown() throws InterruptedException
	{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath(" ")).click();
		String str=driver.getWindowHandle();
		Set<String>newwindow=driver.getWindowHandles();
		System.out.println(newwindow);
		for(String handle:newwindow)
		{
			if(!handle.equals(str))
			{
				driver.switchTo().window(handle);
				driver.getTitle();
				
			}
		}
		
		
		
		
	}
	
	

}
