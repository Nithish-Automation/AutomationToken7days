package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		
		
		
	}

}
