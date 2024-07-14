package SeleniumTest.SeleniumTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2024");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept cookies']")).click();
		List<WebElement> teamName = driver.findElements(By.xpath("*//tbody[@id='pointsdata']/tr/td/descendant::h2"));
		List<WebElement> teamscore = driver.findElements(By.xpath("*//tbody[@id='pointsdata']/tr/td[11]"));
		Thread.sleep(5000);

		List<String> tname = new ArrayList<String>();
		for (WebElement e : teamName) {
			tname.add(e.getText());
		}

		List<Integer> tscore = new ArrayList<Integer>();
		for (WebElement e : teamscore) {
			tscore.add(Integer.parseInt(e.getText()));
		}
		Thread.sleep(2000);
		Thread.sleep(2000);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < tscore.size(); i++) {
			map.put(tname.get(i), tscore.get(i));
		}
		System.out.println(map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 15) {
				System.out.println("Team names having sc	ore greater than: "+entry.getKey());
			}
		}
		driver.close();

	}

	}


