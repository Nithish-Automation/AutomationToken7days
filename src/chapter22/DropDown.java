package chapter22;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement drop = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(drop);

		
//		  s.selectByValue("4"); 
//		  Thread.sleep(3000);
		 
		List<WebElement> dropDown = s.getOptions();

		List<String> dropOptions = dropDown.stream().map(ele -> ele.getText()).sorted().collect(Collectors.toList());

		dropOptions.forEach(drpodown -> System.out.println(drpodown));

		WebElement multiselect = driver.findElement(By.id("cars"));

		Select m = new Select(multiselect);
		System.out.println();
		System.out.println(m.isMultiple());
		driver.quit();
	}

}
