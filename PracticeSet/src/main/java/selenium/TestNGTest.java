package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTest {
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		WebElement enterKey=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		enterKey.sendKeys("selenium");
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		for(int i=0;i<list.size();i++)
			{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium"))
			{
				Thread.sleep(5000);
				list.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		System.out.println("vikas");
		driver.close();
		
	}

}
