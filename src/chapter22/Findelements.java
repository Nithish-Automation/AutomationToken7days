package chapter22;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements {
	
	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		List<WebElement> ele = driver.findElements(By.tagName("input"));
		
		List<String> sorted = ele.stream()
				.map(elel->elel.getAttribute("placeholder"))
				.collect(Collectors.toList());
		
		sorted.forEach(e->System.out.println(e));
		
		driver.quit();
		
	}

}
