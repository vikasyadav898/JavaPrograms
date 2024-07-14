package selemium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableFindValue {
	@Test
	public static void selectperticularValue() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//user wants to select value where 5th row and 1st colmun
		String name=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		System.out.println("name of book is: "+name);
		
		//find the number of row
		int numRow=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();	
		int numCol=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		for(int i=2;i<numRow;i++)
		{
			String authName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(authName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				 System.out.println("Name of Book are:"+bookName);
			}
		}
		for(int j=2;j<numRow;j++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[4]")).getText();
			if(price.equals("2000"))
			{
				String auth=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[2]")).getText();
				 System.out.println("Name of authour:"+auth);
			}
			
		}
		for(int k=2;k<numRow;k++)
		{
			String str=driver.findElement(By.xpath("//table[@name='BookTable']//tr//th[4]")).getText();
			System.out.println(str);
		}
	}

}
