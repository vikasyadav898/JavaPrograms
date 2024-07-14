package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("iphone");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("document.getElementsByName('btnK')[0].click();");
		 driver.close();

	}

}
