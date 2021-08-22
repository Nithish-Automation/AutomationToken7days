package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AmazonJava8 {
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement drop = driver.findElement(By.id("month"));
		Select s = new Select(drop);
		s.selectByVisibleText("May");
		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		
		List<String> sorted = options.stream()
		.map(e->e.getText())
		.sorted()
		.collect(Collectors.toList());
		sorted.forEach(ele->System.out.println(ele));
		
		driver.quit();
		
		
		
	}

}
