package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AmazonDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(drop);
		s.selectByIndex(6);
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=beauty");
		
		s.selectByVisibleText("Books");
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for (WebElement b : options) {
			System.out.println(b.getText());
			
		}
	
	}

}
