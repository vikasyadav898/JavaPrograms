package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
		

		
		

		
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the IPL points table page
		        driver.get("https://www.iplt20.com/points-table/men/2024");

		        // Find the rows in the points table
		        List<WebElement> rows = driver.findElements(By.cssSelector("table.table tbody tr"));

		        // Iterate over the rows and extract team names with points more than 15
		        for (WebElement row : rows) {
		            List<WebElement> columns = row.findElements(By.tagName("td"));
		            String teamName = columns.get(1).getText();
		            int points = Integer.parseInt(columns.get(6).getText()); // Assuming the 7th column contains the points
		            if (points > 15) {
		                System.out.println(teamName);
		            }
		        }

		        // Close the WebDriver
		        driver.quit();
		    }
		

}
