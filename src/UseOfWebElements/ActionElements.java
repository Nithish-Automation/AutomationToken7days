package UseOfWebElements;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionElements {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele =driver.findElement(By.id("nav-search-bar-form"));
        Dimension s = ele.getSize();
        Point loc = ele.getLocation();
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
		System.out.println("X axis dimention "+loc.getX());
		System.out.println("Y axis dimention "+loc.getY());
		System.out.println(ele.getAttribute("aria-label"));
	}

}
