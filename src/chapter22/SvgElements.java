package chapter22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgElements {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://emicalculator.net/");
		
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlist = driver.findElements(By.xpath(verticalXpath));
		System.out.println("Total list:"+barlist.size());
		
		Actions act = new Actions(driver);
		for (WebElement e : barlist) {
			act.moveToElement(e).perform();
			
			
			
		}
		
		driver.quit();
	}

}
