package selemium;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {
	@Test
	public void staticTable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		int numOfRow=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total Numbers of row:"+numOfRow);
		List<WebElement>list=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("list of size is"+list.size());
		for(WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
		int nocolmun =driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
		System.out.println("number of colmun are:"+nocolmun);
		
		//user wants to select value where 5th row and 1st colmun
		String str1=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		System.out.println("value in 5th row and 1st colmon"+str1);
		
		//read data from all rows and columns 
		for(int r=2;r<numOfRow;r++)
		{
			for(int c=1;c<nocolmun;c++)
			{
				
				Object str2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(str2);
			}
		}
		 for(int an=2;an<numOfRow;an++)
		 {
			 String authName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+an+"]//td[2]")).getText();
			 if(authName.equals("Mukesh"))
			 {
				 String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+an+"]//td[1]")).getText();
				 System.out.println("Name of Book are:"+bookName);
			 }
			 
		 }
		
		driver.close();
	}

}
