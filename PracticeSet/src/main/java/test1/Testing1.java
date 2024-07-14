package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2024.");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"cookie__accept cookie__accept_btn\"]")).click();
		//rows = driver.find_elements(By.CSS_SELECTOR, "table.table tbody tr")
		

	}

}
