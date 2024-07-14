package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        //try {
            // Navigate to the Time and Date weather page
            driver.get("https://www.iplt20.com/points-table/men/2024.");
            Thread.sleep(5000);
            driver.manage().window().maximize();
            

            // Wait until the table of temperatures is visible
            Thread.sleep(5000); // Using Thread.sleep for simplicity

            // Get all rows in the table body
            List<WebElement> list = driver.findElements(By.xpath("//tbody[@id='pointsdata']//tr"));
            
            for (WebElement row : list)
            {
            	String teamName=row.findElement(By.xpath("//h2[@class='ih-pt-cont mb-0 ng-binding']")).getText();
            	//int score=Integer.parseInt(row.findElement(By.xpath("//td[@class='bt ng-binding']")));
            	
            	
            	
            }//
	}
}

            // Iterate over rows and extract country name and high temperature
            /*for (WebElement row : rows) {
            	System.out.println("vikas");
                String countryName = row.findElement(By.xpath("./td[1]")).getText();
                String highTemp = row.findElement(By.xpath("./td[4]")).getText();
                System.out.println("Country: " + countryName + ", High Temperature: " + highTemp);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }*/
    


