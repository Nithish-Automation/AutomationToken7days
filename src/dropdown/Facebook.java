package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement drop = driver.findElement(By.id("month"));
		Select s = new Select(drop);
		System.out.println(s.isMultiple());
		s.selectByIndex(3);
		s.selectByVisibleText("May");
		
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		ArrayList<String> a=new ArrayList<>();
		
		
		for (WebElement b : option) {
			String text = b.getText();
			System.out.println(text);
			a.add(text);
			}
		
		Collections.sort(a);
		System.out.println("After Sorting");
		
	
		for (Object r : a) {
			System.out.println(r);
			
		}
		
			
	}

}
